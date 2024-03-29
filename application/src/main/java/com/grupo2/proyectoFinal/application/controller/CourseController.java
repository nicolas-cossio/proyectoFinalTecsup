package com.grupo2.proyectoFinal.application.controller;

import com.grupo2.proyectoFinal.domain.aggregates.dto.CourseDto;
import com.grupo2.proyectoFinal.domain.aggregates.request.CourseRequest;
import com.grupo2.proyectoFinal.domain.ports.in.CourseServiceIn;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/v1/course")
@RequiredArgsConstructor
public class CourseController {
    private final CourseServiceIn courseServiceIn;

    @PostMapping
    public ResponseEntity<CourseDto> createCourse(@RequestBody CourseRequest requestCourse) {
        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(courseServiceIn.createCourseIn(requestCourse));
    }

    @GetMapping("/{id}")
    public ResponseEntity<CourseDto> getCourse(@PathVariable Long id) {
        return ResponseEntity
                .status(HttpStatus.OK)
                .body(courseServiceIn.getCourseIn(id).get());
    }

    @GetMapping()
    public ResponseEntity<List<CourseDto>> getAllCourses() {
        return ResponseEntity
                .status(HttpStatus.OK)
                .body(courseServiceIn.getAllCoursesIn());
    }

    @PutMapping("/{id}")
    public ResponseEntity<CourseDto> updateCourse(@PathVariable Long id, @RequestBody CourseRequest requestCourse){
        return ResponseEntity
                .status(HttpStatus.OK)
                .body(courseServiceIn.updateCourseIn(id, requestCourse));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<CourseDto> deleteCourse(@PathVariable Long id) {
        return ResponseEntity
                .status(HttpStatus.OK)
                .body(courseServiceIn.deleteCourseIn(id));
    }
}
