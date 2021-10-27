package pro.gravit.simplecabinet.web.dto;

import pro.gravit.simplecabinet.web.model.UserSession;

import java.time.LocalDateTime;

public class UserSessionDto {
    public final long id;
    public final String client;
    public final LocalDateTime createdAt;
    public final boolean hardware;

    public UserSessionDto(UserSession entity) {
        this.id = entity.getId();
        this.client = entity.getClient();
        this.hardware = entity.getHardwareId() != null;
        this.createdAt = entity.getCreatedAt();
    }
}