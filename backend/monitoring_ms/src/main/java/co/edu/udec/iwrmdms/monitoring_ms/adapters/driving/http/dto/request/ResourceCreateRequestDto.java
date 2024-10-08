package co.edu.udec.iwrmdms.monitoring_ms.adapters.driving.http.dto.request;

import co.edu.udec.iwrmdms.monitoring_ms.domains.model.enums.Type;

public record ResourceCreateRequestDto(
        String name,
        Type type,
        Float latitude,
        Float longitude,
        String location
) {
}
