package com.grupo2.proyectoFinal.domain.aggregates.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class ModuleDto {
    private String name;
    private String description;
    private Date initialDate;
    private Date finalDate;
}
