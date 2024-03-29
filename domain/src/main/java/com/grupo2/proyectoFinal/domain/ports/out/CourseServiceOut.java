package com.grupo2.proyectoFinal.domain.ports.out;

import com.grupo2.proyectoFinal.domain.aggregates.dto.CourseDto;
import com.grupo2.proyectoFinal.domain.aggregates.request.CourseRequest;

import java.util.List;
import java.util.Optional;

public interface CourseServiceOut {
    CourseDto createCourseOut(CourseRequest requestCourse);
    Optional<CourseDto> getCourseOut(Long id);
    List<CourseDto> getAllCoursesOut();
    CourseDto updateCourseOut(Long id, CourseRequest requestCourse);
    CourseDto deleteCourseOut(Long id);
}
