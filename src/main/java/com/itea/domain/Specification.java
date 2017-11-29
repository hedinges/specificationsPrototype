package com.itea.domain;

import static java.lang.Boolean.FALSE;
import org.springframework.data.annotation.Id;

public class Specification {

    @Id private String id;


    private SpecificationType type;

    private String key;

    private Boolean boolValue=FALSE;
    private String value = "";



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
