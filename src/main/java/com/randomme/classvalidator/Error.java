package com.randomme.classvalidator;

public class Error {
    private String fieldName;
    private Object fieldValue;
    private String validatorName;

    public Error(String fieldName, Object fieldValue, String validatorName ) {
        this.fieldName = fieldName;
        this.fieldValue = fieldValue;
        this.validatorName = validatorName;
    }

    public String getFieldName() {
        return fieldName;
    }

    public Object getFieldValue() {
        return fieldValue;
    }

    public String getValidatorName() {
        return validatorName;
    }

    public String getMessage() {
        return "Field " + this.fieldName + " failed " + this.validatorName + " validator with value " + this.fieldValue + ". ";
    }

    public Exception getException() {
        return new Exception( this.getMessage() );
    }
}