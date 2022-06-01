package com.todayreservation.util;

import java.time.LocalDateTime;

public class SuccessResponse {
    int statusCode;
    LocalDateTime responsedTime;
    Object items;

    public int getStatusCode() {
        return statusCode;
    }
    public void setStatusCode(int statusCode) {
        this.statusCode = statusCode;
    }

    public LocalDateTime getResponsedTime() {
        return responsedTime;
    }
    public void setResponsedTime(LocalDateTime responsedTime) {
        this.responsedTime = responsedTime;
    }

    public Object getItems() {
        return items;
    }

    public SuccessResponse() {}

    public SuccessResponse(int statusCode, LocalDateTime responsedTime, Object items) {
        this.statusCode = statusCode;
        this.responsedTime = responsedTime;
        this.items = items;
    }
}
