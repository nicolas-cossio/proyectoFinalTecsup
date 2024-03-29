package com.grupo2.proyectoFinal.domain.impl;

import com.grupo2.proyectoFinal.domain.aggregates.dto.UserDto;
import com.grupo2.proyectoFinal.domain.aggregates.request.UserRequest;
import com.grupo2.proyectoFinal.domain.ports.in.UserServiceIn;
import com.grupo2.proyectoFinal.domain.ports.out.UserServiceOut;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserServiceIn {
    private final UserServiceOut userServiceOut;

    @Override
    public UserDto crearUserIn(UserRequest requestPersona) {
        return userServiceOut.crearUserOut(requestPersona);
    }
}
