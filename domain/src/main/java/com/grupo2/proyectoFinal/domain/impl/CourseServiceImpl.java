package com.grupo2.proyectoFinal.domain.impl;

import com.grupo2.proyectoFinal.domain.aggregates.dto.CourseDto;
import com.grupo2.proyectoFinal.domain.aggregates.request.CourseRequest;
import com.grupo2.proyectoFinal.domain.ports.in.CourseServiceIn;
import com.grupo2.proyectoFinal.domain.ports.out.CourseServiceOut;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class CourseServiceImpl implements CourseServiceIn {
    private final CourseServiceOut courseServiceOut;

    @Override
    public CourseDto createCourseIn(CourseRequest requestCourse) {
        return courseServiceOut.createCourseOut(requestCourse);
    }

    @Override
    public Optional<CourseDto> getCourseIn(Long id) {
        return courseServiceOut.getCourseOut(id);
    }

    @Override
    public List<CourseDto> getAllCoursesIn() {
        return courseServiceOut.getAllCoursesOut();
    }

    @Override
    public CourseDto updateCourseIn(Long id, CourseRequest requestCourse) {
        return courseServiceOut.updateCourseOut(id, requestCourse);
    }

    @Override
    public CourseDto deleteCourseIn(Long id) {
        return courseServiceOut.deleteCourseOut(id);
    }
}
