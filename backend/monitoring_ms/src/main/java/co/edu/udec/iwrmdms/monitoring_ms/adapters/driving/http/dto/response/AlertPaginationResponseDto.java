package co.edu.udec.iwrmdms.monitoring_ms.adapters.driving.http.dto.response;

import co.edu.udec.iwrmdms.monitoring_ms.domains.model.enums.Level;

import java.time.LocalDate;

public record AlertPaginationResponseDto(
        LocalDate date,
        Level level,
        String message,
        Integer userId,
        EventResponseDto event
) {
}
