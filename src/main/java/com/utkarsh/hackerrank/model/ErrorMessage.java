package com.utkarsh.hackerrank.model;

public class ErrorMessage {
    private String message;
    private String status;
    private Boolean successful;

    public ErrorMessage(String message, String status, Boolean successful) {
        this.message = message;
        this.status = status;
        this.successful = successful;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Boolean getSuccessful() {
        return successful;
    }

    public void setSuccessful(Boolean successful) {
        this.successful = successful;
    }
}
