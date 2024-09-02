package com.example.model;

public class JsonPayload {

    private String loggerClass,
    component,
    spanId,
    messagedetail,
    traceId,
    message;

    public JsonPayload() {
    }

    public String getLoggerClass() {
        return loggerClass;
    }

    public void setLoggerClass(String loggerClass) {
        this.loggerClass = loggerClass;
    }

    public String getComponent() {
        return component;
    }

    public void setComponent(String component) {
        this.component = component;
    }

    public String getSpanId() {
        return spanId;
    }

    public void setSpanId(String spanId) {
        this.spanId = spanId;
    }

    public String getMessagedetail() {
        return messagedetail;
    }

    public void setMessagedetail(String messagedetail) {
        this.messagedetail = messagedetail;
    }

    public String getTraceId() {
        return traceId;
    }

    public void setTraceId(String traceId) {
        this.traceId = traceId;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
