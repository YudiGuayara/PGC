package co.edu.udec.iwrmdms.monitoring_ms.domains.spi;

import co.edu.udec.iwrmdms.monitoring_ms.adapters.driving.http.dto.response.AlertListResponseDto;
import co.edu.udec.iwrmdms.monitoring_ms.adapters.driving.http.dto.response.AlertPaginationResponseDto;
import co.edu.udec.iwrmdms.monitoring_ms.adapters.driving.http.dto.response.AlertResponseDto;
import co.edu.udec.iwrmdms.monitoring_ms.domains.model.Alert;
import io.vavr.control.Either;
import org.springframework.data.domain.Page;

import java.util.List;

public interface IAlertPersistencePort {
    void saveAlert(Alert alert);
    Page<AlertPaginationResponseDto> getPaginationAlert(Integer pageSize, String sortBy);
    List<AlertListResponseDto> getListAlert();
    AlertResponseDto getAlertById(Integer idAlert);
    void deleteAlert(Integer idAlert);
}
