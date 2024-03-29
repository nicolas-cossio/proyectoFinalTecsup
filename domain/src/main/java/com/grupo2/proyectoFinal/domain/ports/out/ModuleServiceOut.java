package com.grupo2.proyectoFinal.domain.ports.out;

import com.grupo2.proyectoFinal.domain.aggregates.dto.ModuleDto;
import com.grupo2.proyectoFinal.domain.aggregates.request.ModuleRequest;

import java.util.List;
import java.util.Optional;

public interface ModuleServiceOut {
    ModuleDto createModuleOut(ModuleRequest requestCourse);
    Optional<ModuleDto> getModuleOut(Long id);
    List<ModuleDto> getAllModulesOut();
    ModuleDto updateModuleOut(Long id, ModuleRequest requestCourse);
    ModuleDto deleteModuleOut(Long id);
}
