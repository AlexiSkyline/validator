package com.randomme.classvalidator.validators.common;

import com.randomme.classvalidator.annotations.common.IsNotNull;
import com.randomme.classvalidator.validators.Validator;

import java.lang.reflect.Field;

public class IsNotNullValidator implements Validator {
    private String message = "The field '%s' is a Null value.";

    @Override
    public Class<?> getAnnotation() {
        return IsNotNull.class;
    }

    @Override
    public boolean isValid( Field field, Object value ) {
        if( value == null ) {
            this.message = String.format( this.message, field.getName() );
            return false;
        }

        return true;
    }

    @Override
    public String getMessage() {
        return this.message;
    }
}