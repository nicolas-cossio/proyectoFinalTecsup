package com.grupo2.proyectoFinal.domain.ports.in;

import com.grupo2.proyectoFinal.domain.aggregates.dto.ModuleDto;
import com.grupo2.proyectoFinal.domain.aggregates.request.ModuleRequest;

import java.util.List;
import java.util.Optional;

public interface ModuleServiceIn {
    ModuleDto createModuleIn(ModuleRequest requestCourse);
    Optional<ModuleDto> getModuleIn(Long id);
    List<ModuleDto> getAllModulesIn();
    ModuleDto updateModuleIn(Long id, ModuleRequest requestCourse);
    ModuleDto deleteModuleIn(Long id);
}
