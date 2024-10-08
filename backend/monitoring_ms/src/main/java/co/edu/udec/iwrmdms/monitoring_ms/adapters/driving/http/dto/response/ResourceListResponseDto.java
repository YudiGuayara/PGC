package co.edu.udec.iwrmdms.monitoring_ms.adapters.driving.http.dto.response;

import co.edu.udec.iwrmdms.monitoring_ms.domains.model.enums.Type;

public record ResourceListResponseDto(
        Integer resourceId,
        String name,
        Type type,
        Float latitude,
        Float longitude,
        String location
) {
}
