package co.edu.udec.iwrmdms.monitoring_ms.adapters.driving.http.dto.response;

public record PollutantPaginationResponseDto(
        String name,
        Float load
) {
}
