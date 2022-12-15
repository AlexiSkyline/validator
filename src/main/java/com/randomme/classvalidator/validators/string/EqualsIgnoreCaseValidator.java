package com.randomme.classvalidator.validators.string;

import com.randomme.classvalidator.annotations.string.Equals;
import com.randomme.classvalidator.validators.StringValidator;

import java.lang.reflect.Field;

public class EqualsIgnoreCaseValidator extends StringValidator {
    @Override
    public Class<?> getAnnotation() {
        return Equals.class;
    }

    @Override
    public boolean isValid( Field field, String value ) {
        Equals annotation = field.getAnnotation( Equals.class );
        return value.equalsIgnoreCase( annotation.value() );
    }
}