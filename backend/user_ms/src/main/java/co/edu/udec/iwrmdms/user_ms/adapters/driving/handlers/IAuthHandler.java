package co.edu.udec.iwrmdms.user_ms.adapters.driving.handlers;

import co.edu.udec.iwrmdms.user_ms.adapters.driving.dto.request.LoginRequestDto;
import co.edu.udec.iwrmdms.user_ms.adapters.driving.dto.response.JwtResponseDto;

import java.text.ParseException;

public interface IAuthHandler {
    JwtResponseDto login(LoginRequestDto loginRequestDto);
    JwtResponseDto refresh(JwtResponseDto jwtResponseDto) throws ParseException;
}
