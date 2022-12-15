package com.randomme.classvalidator.validators.string;

import com.randomme.classvalidator.annotations.string.NotContains;
import com.randomme.classvalidator.validators.StringValidator;

import java.lang.reflect.Field;

public class NotContainsValidator extends StringValidator {
    @Override
    public Class<?> getAnnotation() {
        return NotContains.class;
    }

    @Override
    public boolean isValid( Field field, String value ) {
        NotContains annotation = field.getAnnotation( NotContains.class );
        return !value.contains( annotation.value() );
    }
}