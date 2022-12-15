package com.randomme.classvalidator;

import com.randomme.classvalidator.validators.Validator;

import java.lang.reflect.Field;

public abstract class StringValidator implements Validator {
    public abstract boolean isValid( Field field, String value );

    public boolean isValid( Field field, Object value ) {
        if( value != null && value instanceof String ) {
            return this.isValid( field, value.toString() );
        }

        return true;
    }
}
