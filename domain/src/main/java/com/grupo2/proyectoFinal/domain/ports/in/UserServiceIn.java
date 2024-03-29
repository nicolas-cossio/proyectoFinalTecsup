package com.grupo2.proyectoFinal.domain.ports.in;

import com.grupo2.proyectoFinal.domain.aggregates.dto.UserDto;
import com.grupo2.proyectoFinal.domain.aggregates.request.UserRequest;

public interface UserServiceIn {
    UserDto crearUserIn(UserRequest requestPersona);

}
