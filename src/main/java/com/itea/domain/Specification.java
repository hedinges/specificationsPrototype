package com.itea.domain;

import static java.lang.Boolean.FALSE;

public class Specification {

    private SpecificationType type;

    private String key;

    private Boolean boolValue=FALSE;
    private String value = "";


    public Specification(SpecificationType type, String key, Boolean boolValue, String value) {
        this.key = key;
        this.boolValue = boolValue;
        this.value = value;
        this.type = type;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public Boolean getBoolValue() {
        return boolValue;
    }

    public void setBoolValue(Boolean boolValue) {
        this.boolValue = boolValue;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
