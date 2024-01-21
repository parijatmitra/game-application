package com.example.Game.exception;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.time.ZonedDateTime;

public class PlayerExceptionResponse {
    @JsonFormat(pattern = "dd-MM-yyyy HH:mm:ss")
    private ZonedDateTime zonedDateTime;
    private int statusCode;
    private String path;
    private String message;

    public PlayerExceptionResponse() {
    }

    public PlayerExceptionResponse(ZonedDateTime zonedDateTime, int statusCode, String path, String message) {
        this.zonedDateTime = zonedDateTime;
        this.statusCode = statusCode;
        this.path = path;
        this.message = message;
    }

    public ZonedDateTime getZonedDateTime() {
        return zonedDateTime;
    }

    public void setZonedDateTime(ZonedDateTime zonedDateTime) {
        this.zonedDateTime = zonedDateTime;
    }

    public int getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(int statusCode) {
        this.statusCode = statusCode;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "PlayerErrorResponse{" +
                "zonedDateTime=" + zonedDateTime +
                ", statusCode=" + statusCode +
                ", path='" + path + '\'' +
                ", message='" + message + '\'' +
                '}';
    }
}
