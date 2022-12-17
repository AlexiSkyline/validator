package com.randomme.classvalidator;

public class Error {
    private String fieldName;
    private Object fieldValue;
    private String validatorName;
    private String message;

    public Error( String fieldName, Object fieldValue, String validatorName, String message ) {
        this.fieldName = fieldName;
        this.fieldValue = fieldValue;
        this.validatorName = validatorName;
        this.message = message;
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
        return this.message;
    }

    public Exception getException() {
        return new Exception( this.getMessage() );
    }
}