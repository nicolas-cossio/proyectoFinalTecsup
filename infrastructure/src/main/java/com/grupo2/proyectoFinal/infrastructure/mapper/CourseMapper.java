package com.grupo2.proyectoFinal.infrastructure.mapper;

import com.grupo2.proyectoFinal.domain.aggregates.dto.CourseDto;
import com.grupo2.proyectoFinal.infrastructure.entity.CourseEntity;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
public class CourseMapper {
    private static final ModelMapper modelMapper = new ModelMapper();

    public CourseDto mapToDto(CourseEntity entity) {
        return modelMapper.map(entity, CourseDto.class);
    }

}
