package com.randomme.classvalidator.validators.string;

import com.randomme.classvalidator.annotations.string.EqualsIgnoreCase;
import com.randomme.classvalidator.validators.StringValidator;

import java.lang.reflect.Field;

public class EqualsIgnoreCaseValidator extends StringValidator {
    @Override
    public Class<?> getAnnotation() {
        return EqualsIgnoreCase.class;
    }

    @Override
    public boolean isValid( Field field, String value ) {
        EqualsIgnoreCase annotation = field.getAnnotation( EqualsIgnoreCase.class );
        if( !value.equalsIgnoreCase( annotation.value() ) ) {
            this.message = String.format( "The property '%s' with the value '%s' is not equal to '%s'.", field.getName(), annotation.value(), value  );
            return false;
        }
        return true;
    }
}