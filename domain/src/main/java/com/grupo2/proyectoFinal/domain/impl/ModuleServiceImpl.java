package com.grupo2.proyectoFinal.domain.impl;

import com.grupo2.proyectoFinal.domain.aggregates.dto.ModuleDto;
import com.grupo2.proyectoFinal.domain.aggregates.request.CourseRequest;
import com.grupo2.proyectoFinal.domain.ports.in.ModuleServiceIn;
import com.grupo2.proyectoFinal.domain.ports.out.ModuleServiceOut;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ModuleServiceImpl implements ModuleServiceIn {
    private final ModuleServiceOut moduleServiceOut;

    @Override
    public ModuleDto createModuleIn(CourseRequest requestCourse) {
        return null;
    }

    @Override
    public Optional<ModuleDto> getModuleIn(Long id) {
        return Optional.empty();
    }

    @Override
    public List<ModuleDto> getAllModulesIn() {
        return null;
    }

    @Override
    public ModuleDto updateModuleIn(Long id, CourseRequest requestCourse) {
        return null;
    }

    @Override
    public ModuleDto deleteModuleIn(Long id) {
        return null;
    }
}
