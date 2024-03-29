package com.grupo2.proyectoFinal.infrastructure.repository;

import com.grupo2.proyectoFinal.infrastructure.entity.CourseEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepository extends JpaRepository<CourseEntity, Long> {
}
