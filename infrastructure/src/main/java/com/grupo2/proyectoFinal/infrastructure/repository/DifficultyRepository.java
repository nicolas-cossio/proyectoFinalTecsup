package com.grupo2.proyectoFinal.infrastructure.repository;

import com.grupo2.proyectoFinal.infrastructure.entity.DifficultyEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DifficultyRepository extends JpaRepository<DifficultyEntity, Long> {
    DifficultyEntity findByDescription(String difficultyLevel);
}
