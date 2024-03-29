package com.grupo2.proyectoFinal.domain.aggregates.request;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CourseRequest {
    private String name;
    private String description;
    private Float price;
    private Integer duration;
    private String difficultyLevel;
}
