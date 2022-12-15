package com.randomme.classvalidator.validators;

import java.lang.reflect.Field;

public abstract class ArrayValidator implements Validator {
    public abstract boolean isValid( Field field, Object[] value );

    public boolean isValid( Field field, Object value ) {
        if ( value != null && value instanceof Object[] ) {
            return this.isValid( field, (Object[]) value );
        }

        return true;
    }
}