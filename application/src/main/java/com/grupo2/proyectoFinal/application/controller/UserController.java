package com.grupo2.proyectoFinal.application.controller;

import com.grupo2.proyectoFinal.domain.aggregates.dto.UserDto;
import com.grupo2.proyectoFinal.domain.aggregates.request.UserRequest;
import com.grupo2.proyectoFinal.domain.ports.in.UserServiceIn;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/user")
@RequiredArgsConstructor
public class UserController {
    private final UserServiceIn userServiceIn;

    @PostMapping
    public ResponseEntity<UserDto> registrar(@RequestBody UserRequest requestPersona) {
        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(userServiceIn.crearUserIn(requestPersona));
    }
}
