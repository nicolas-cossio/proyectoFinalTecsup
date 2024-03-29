package com.grupo2.proyectoFinal.domain.ports.in;

import com.grupo2.proyectoFinal.domain.aggregates.dto.CourseDto;
import com.grupo2.proyectoFinal.domain.aggregates.request.CourseRequest;

import java.util.List;
import java.util.Optional;


public interface CourseServiceIn {
    CourseDto createCourseIn(CourseRequest requestCourse);
    Optional<CourseDto> getCourseIn(Long id);
    List<CourseDto> getAllCoursesIn();
    CourseDto updateCourseIn(Long id, CourseRequest requestCourse);
    CourseDto deleteCourseIn(Long id);
}
