package com.grupo2.proyectoFinal.infrastructure.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.sql.Date;
import java.sql.Timestamp;

@Table(name = "comments")
@Entity
@Getter
@Setter
public class Comment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String description;
    private Integer rating;
    private Date date;

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

    @ManyToOne
    @JoinColumn(name = "id_user")
    private User user;

    @ManyToOne
    @JoinColumn(name = "id_course")
    private CourseEntity courseEntity;
}
