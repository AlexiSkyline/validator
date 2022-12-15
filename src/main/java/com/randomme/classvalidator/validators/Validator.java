package com.randomme.classvalidator.validators;

import java.lang.reflect.Field;

public interface Validator {
    public Class<?> getAnnotation();
    public boolean isValid( Field field, Object value );

    public default String getName() {
        return this.getAnnotation().getSimpleName();
    }
}