package co.edu.udec.iwrmdms.monitoring_ms.domains.api;

public interface IAuthenticationUserInfoServicePort {
    String getUsernameFromToken();
    Long getIdUserFromToken();
}
