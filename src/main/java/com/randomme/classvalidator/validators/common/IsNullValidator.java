package com.randomme.classvalidator.validators.common;

import com.randomme.classvalidator.annotations.common.IsNull;
import com.randomme.classvalidator.validators.Validator;

import java.lang.reflect.Field;

public class IsNullValidator implements Validator {
    @Override
    public Class<?> getAnnotation() {
        return IsNull.class;
    }

    @Override
    public boolean isValid( Field field, Object value ) {
        return value == null;
    }
}