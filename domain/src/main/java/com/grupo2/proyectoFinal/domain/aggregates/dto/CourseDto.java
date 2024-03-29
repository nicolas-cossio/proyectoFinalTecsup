package com.grupo2.proyectoFinal.domain.aggregates.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CourseDto {
    private String name;
    private String description;
    private Float price;
    private Integer duration;
    private String difficulty;
}
