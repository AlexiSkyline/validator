package com.randomme.classvalidator.validators;

import java.lang.reflect.Field;

public abstract class ArrayValidator implements Validator {
    protected String message;
    public abstract boolean isValid( Field field, Object[] value );

    public boolean isValid( Field field, Object value ) {
        if ( value instanceof Object[] ) {
            return this.isValid( field, (Object[]) value );
        }
        return true;
    }

    @Override
    public String getMessage() {
        return this.message;
    }
}