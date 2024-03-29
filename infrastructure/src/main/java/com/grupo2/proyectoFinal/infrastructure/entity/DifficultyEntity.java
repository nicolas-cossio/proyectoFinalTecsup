package com.grupo2.proyectoFinal.infrastructure.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.sql.Timestamp;

@Table(name = "difficulty_level")
@Entity
@Getter
@Setter
public class DifficultyEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String description;

    // Audit columns
    @Column(nullable = false)
    private Integer status;

    @Column(name = "usua_create", length = 45)
    private String usuaCreate;

    @Column(name = "date_create")
    private Timestamp dateCreate;

    @Column(name = "usua_modif", length = 45)
    private String usuaModif;

    @Column(name = "date_modif")
    private Timestamp dateModif;

    @Column(name = "usua_delet", length = 45)
    private String usuaDelet;

    @Column(name = "date_delet")
    private Timestamp dateDelet;
}
