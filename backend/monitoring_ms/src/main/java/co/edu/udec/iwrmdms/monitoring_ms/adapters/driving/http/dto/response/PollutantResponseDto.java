package co.edu.udec.iwrmdms.monitoring_ms.adapters.driving.http.dto.response;

public record PollutantResponseDto(
        Integer pollutantId,
        String name,
        Float load
) {
}
