package com.grupo2.proyectoFinal.domain.ports.out;

import com.grupo2.proyectoFinal.domain.aggregates.dto.UserDto;
import com.grupo2.proyectoFinal.domain.aggregates.request.UserRequest;

public interface UserServiceOut {
    UserDto crearUserOut(UserRequest requestPersona);
}
