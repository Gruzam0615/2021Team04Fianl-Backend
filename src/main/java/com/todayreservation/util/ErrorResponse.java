package com.todayreservation.util;

import java.time.LocalDateTime;

public class ErrorResponse {
    
    LocalDateTime responsedTime;
    StatusCode errorCode;    

    public LocalDateTime getResponsedTime() {
        return responsedTime;
    }

    public void setResponsedTime(LocalDateTime responsedTime) {
        this.responsedTime = responsedTime;
    }

    public StatusCode getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(StatusCode errorCode) {
        this.errorCode = errorCode;
    }

    public ErrorResponse() {}

    public ErrorResponse(LocalDateTime responsedTime, StatusCode errorCode) {
        this.responsedTime = responsedTime;
        this.errorCode = errorCode;
    }

    @Override
    public String toString() {
        return  "responsedTime= " + responsedTime + ", " + "ErrorResponse [errorCode=" + errorCode + "]";
    }

    

}
