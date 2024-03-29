package com.grupo2.proyectoFinal.application.controller;

import com.grupo2.proyectoFinal.domain.ports.in.AuthenticationServiceIn;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/authentication")
@RequiredArgsConstructor
public class AuthenticationController {
    private final AuthenticationServiceIn authenticationServiceIn;
}
