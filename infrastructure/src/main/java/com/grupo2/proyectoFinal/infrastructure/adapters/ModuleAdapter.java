package com.grupo2.proyectoFinal.infrastructure.adapters;

import com.grupo2.proyectoFinal.domain.aggregates.dto.ModuleDto;
import com.grupo2.proyectoFinal.domain.aggregates.request.ModuleRequest;
import com.grupo2.proyectoFinal.domain.ports.out.ModuleServiceOut;

import java.util.List;
import java.util.Optional;

public class ModuleAdapter implements ModuleServiceOut {
    @Override
    public ModuleDto createModuleOut(ModuleRequest requestCourse) {
        return null;
    }

    @Override
    public Optional<ModuleDto> getModuleOut(Long id) {
        return Optional.empty();
    }

    @Override
    public List<ModuleDto> getAllModulesOut() {
        return null;
    }

    @Override
    public ModuleDto updateModuleOut(Long id, ModuleRequest requestCourse) {
        return null;
    }

    @Override
    public ModuleDto deleteModuleOut(Long id) {
        return null;
    }
}
