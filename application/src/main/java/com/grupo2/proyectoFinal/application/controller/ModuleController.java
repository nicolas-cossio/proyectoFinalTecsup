package com.grupo2.proyectoFinal.application.controller;

import com.grupo2.proyectoFinal.domain.aggregates.dto.ModuleDto;
import com.grupo2.proyectoFinal.domain.aggregates.request.ModuleRequest;
import com.grupo2.proyectoFinal.domain.ports.in.ModuleServiceIn;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/v1/module")
@RequiredArgsConstructor
public class ModuleController {
    private final ModuleServiceIn moduleServiceIn;

    @PostMapping
    public ResponseEntity<ModuleDto> createModule(@RequestBody ModuleRequest requestModule) {
        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(moduleServiceIn.createModuleIn(requestModule));
    }

    @GetMapping("/{id}")
    public ResponseEntity<ModuleDto> getModule(@PathVariable Long id) {
        return ResponseEntity
                .status(HttpStatus.OK)
                .body(moduleServiceIn.getModuleIn(id).get());
    }

    @GetMapping()
    public ResponseEntity<List<ModuleDto>> getAllModules() {
        return ResponseEntity
                .status(HttpStatus.OK)
                .body(moduleServiceIn.getAllModulesIn());
    }

    @PutMapping("/{id}")
    public ResponseEntity<ModuleDto> updateModule(@PathVariable Long id, @RequestBody ModuleRequest requestModule){
        return ResponseEntity
                .status(HttpStatus.OK)
                .body(moduleServiceIn.updateModuleIn(id, requestModule));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<ModuleDto> deleteModule(@PathVariable Long id) {
        return ResponseEntity
                .status(HttpStatus.OK)
                .body(moduleServiceIn.deleteModuleIn(id));
    }
}
