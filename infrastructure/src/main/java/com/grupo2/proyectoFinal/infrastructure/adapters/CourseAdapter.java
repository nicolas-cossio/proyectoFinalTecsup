package com.grupo2.proyectoFinal.infrastructure.adapters;

import com.grupo2.proyectoFinal.domain.aggregates.constants.Constants;
import com.grupo2.proyectoFinal.domain.aggregates.dto.CourseDto;
import com.grupo2.proyectoFinal.domain.aggregates.request.CourseRequest;
import com.grupo2.proyectoFinal.domain.ports.out.CourseServiceOut;
import com.grupo2.proyectoFinal.infrastructure.entity.CourseEntity;
import com.grupo2.proyectoFinal.infrastructure.entity.DifficultyEntity;
import com.grupo2.proyectoFinal.infrastructure.mapper.CourseMapper;
import com.grupo2.proyectoFinal.infrastructure.repository.CourseRepository;
import com.grupo2.proyectoFinal.infrastructure.repository.DifficultyRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class CourseAdapter implements CourseServiceOut {
    private final CourseRepository courseRepository;
    private final DifficultyRepository difficultyRepository;
    private final CourseMapper courseMapper;

    @Override
    public CourseDto createCourseOut(CourseRequest requestCourse) {
        DifficultyEntity difficultyEntity =
                difficultyRepository.findByDescription(requestCourse.getDifficultyLevel());
        CourseEntity entity = new CourseEntity();
        entity.setName(requestCourse.getName());
        entity.setDescription(requestCourse.getDescription());
        entity.setPrice(requestCourse.getPrice());
        entity.setDuration(requestCourse.getDuration());
        entity.setDifficultyEntity(difficultyEntity);
        entity.setStatus(Constants.STATUS_ACTIVE);
        entity.setUsuaCreate(Constants.AUDIT_ADMIN);
        entity.setDateCreate(getTimestamp());
        courseRepository.save(entity);
        return courseMapper.mapToDto(entity);
    }

    @Override
    public Optional<CourseDto> getCourseOut(Long id) {
        if (courseRepository.findById(id).isPresent()) {
            CourseDto courseDto = courseMapper.mapToDto(courseRepository.findById(id).get());
            return Optional.of(courseDto);
        }
        return Optional.empty();
    }

    @Override
    public List<CourseDto> getAllCoursesOut() {
        List<CourseDto> courses = new ArrayList<>();
        courseRepository.findAll().forEach(course -> courses.add(courseMapper.mapToDto(course)));
        return courses;
    }

    @Override
    public CourseDto updateCourseOut(Long id, CourseRequest requestCourse) {
        boolean exists = courseRepository.existsById(id);
        if (exists) {
            DifficultyEntity difficultyEntity =
                    difficultyRepository.findByDescription(requestCourse.getDifficultyLevel());
            CourseEntity entity = courseRepository.findById(id).get();
            entity.setName(requestCourse.getName());
            entity.setDescription(requestCourse.getDescription());
            entity.setPrice(requestCourse.getPrice());
            entity.setDuration(requestCourse.getDuration());
            entity.setDifficultyEntity(difficultyEntity);
            entity.setUsuaModif(Constants.AUDIT_ADMIN);
            entity.setDateModif(getTimestamp());
            courseRepository.save(entity);
            return courseMapper.mapToDto(entity);
        }
        return null;
    }

    @Override
    public CourseDto deleteCourseOut(Long id) {
        boolean exists = courseRepository.existsById(id);
        if (exists) {
            Optional<CourseEntity> entity = courseRepository.findById(id);
            entity.get().setStatus(0);
            entity.get().setUsuaDelet(Constants.AUDIT_ADMIN);
            entity.get().setDateDelet(getTimestamp());
            courseRepository.save(entity.get());
            return courseMapper.mapToDto(entity.get());
        }
        return null;
    }

    private Timestamp getTimestamp() {
        long currentTime = System.currentTimeMillis();
        return new Timestamp(currentTime);
    }
}
