package com.randomme.classvalidator.validators;

import java.lang.reflect.Field;

public abstract class StringValidator implements Validator {
    protected String message;
    public abstract boolean isValid( Field field, String value );

    public boolean isValid( Field field, Object value ) {
        if ( value instanceof String ) {
            return this.isValid( field, (String) value );
        }
        return true;
    }

    @Override
    public String getMessage() {
        return this.message;
    }
}