package com.grupo2.proyectoFinal.infrastructure.adapters;

import com.grupo2.proyectoFinal.domain.aggregates.dto.UserDto;
import com.grupo2.proyectoFinal.domain.aggregates.request.UserRequest;
import com.grupo2.proyectoFinal.domain.ports.out.UserServiceOut;

public class UserAdapter implements UserServiceOut {

    @Override
    public UserDto crearUserOut(UserRequest requestPersona) {
        return null;
    }
}
