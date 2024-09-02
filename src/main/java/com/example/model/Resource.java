package com.example.model;

import java.util.HashMap;
import java.util.Map;

public class Resource {

    private String type;
    private Map<String, String> labels = new HashMap<>();

    public Resource() {
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Map<String, String> getLabels() {
        return labels;
    }

    public void setLabels(Map<String, String> labels) {
        this.labels = labels;
    }
}
