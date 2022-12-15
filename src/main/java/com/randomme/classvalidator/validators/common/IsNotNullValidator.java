package com.randomme.classvalidator.validators.common;

import com.randomme.classvalidator.annotations.common.IsNotNull;
import com.randomme.classvalidator.validators.Validator;

import java.lang.reflect.Field;

public class IsNotNullValidator implements Validator {
    @Override
    public Class<?> getAnnotation() {
        return IsNotNull.class;
    }

    @Override
    public boolean isValid( Field field, Object value ) {
        return value != null;
    }
}