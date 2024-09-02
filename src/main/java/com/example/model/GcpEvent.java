package com.example.model;

import java.util.HashMap;
import java.util.Map;

public class GcpEvent {
    private String insertId;
    private JsonPayload jsonPayload;
    private Resource resource;
    private String timestamp;
    private String severity;
    private Map<String,String> labels = new HashMap<>();
    private String logName;
    private String receiveTimestamp;

    public GcpEvent() {
    }

    public String getInsertId() {
        return insertId;
    }

    public void setInsertId(String insertId) {
        this.insertId = insertId;
    }

    public JsonPayload getJsonPayload() {
        return jsonPayload;
    }

    public void setJsonPayload(JsonPayload jsonPayload) {
        this.jsonPayload = jsonPayload;
    }

    public Resource getResource() {
        return resource;
    }

    public void setResource(Resource resource) {
        this.resource = resource;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    public String getSeverity() {
        return severity;
    }

    public void setSeverity(String severity) {
        this.severity = severity;
    }

    public Map<String, String> getLabels() {
        return labels;
    }

    public void setLabels(Map<String, String> labels) {
        this.labels = labels;
    }

    public String getLogName() {
        return logName;
    }

    public void setLogName(String logName) {
        this.logName = logName;
    }

    public String getReceiveTimestamp() {
        return receiveTimestamp;
    }

    public void setReceiveTimestamp(String receiveTimestamp) {
        this.receiveTimestamp = receiveTimestamp;
    }
}
