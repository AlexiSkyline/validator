package com.randomme.classvalidator.validators.string;

import com.randomme.classvalidator.annotations.string.IsNotEmpty;
import com.randomme.classvalidator.validators.StringValidator;

import java.lang.reflect.Field;

public class IsNotEmptyValidator extends StringValidator {
    @Override
    public Class<?> getAnnotation() {
        return IsNotEmpty.class;
    }

    @Override
    public boolean isValid( Field field, String value ) {
        IsNotEmpty notEmpty = field.getAnnotation( IsNotEmpty.class );
        return notEmpty.trim() ? !value.trim().isEmpty() : !value.isEmpty();
    }
}