package com.grupo2.proyectoFinal.domain.aggregates.request;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class ModuleRequest {
    private String name;
    private String description;
    private Date initialDate;
    private Date finalDate;
    private String course;
}
