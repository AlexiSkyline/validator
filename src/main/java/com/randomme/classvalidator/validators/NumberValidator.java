package com.randomme.classvalidator.validators;

import java.lang.reflect.Field;

public abstract class NumberValidator implements Validator {
    protected String message;
    public abstract boolean isValid( Field field, Number value );

    public boolean isValid( Field field, Object value ) {
        if( value instanceof Number ) {
            return this.isValid( field, ((Number) value).doubleValue() );
        }
        return true;
    }

    @Override
    public String getMessage() {
        return this.message;
    }
}