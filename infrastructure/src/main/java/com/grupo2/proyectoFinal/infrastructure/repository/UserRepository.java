package com.grupo2.proyectoFinal.infrastructure.repository;

import com.grupo2.proyectoFinal.infrastructure.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
