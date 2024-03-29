package com.grupo2.proyectoFinal.infrastructure.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.sql.Timestamp;
import java.util.Date;

@Entity
@Table(name = "modules")
@Getter
@Setter
public class Module {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;
    @Column(nullable = false)
    private String description;
    @Column(name="initialdate", nullable = false)
    private Date initialDate;
    @Column(name="finaldate", nullable = false)
    private Date finalDate;

    @ManyToOne
    @JoinColumn(name = "id_course", nullable = false)
    private Course course;

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
