package com.randomme.classvalidator.validators.string;

import com.randomme.classvalidator.annotations.string.Equals;
import com.randomme.classvalidator.validators.StringValidator;

import java.lang.reflect.Field;

public class EqualsValidator extends StringValidator {
    @Override
    public Class<?> getAnnotation() {
        return Equals.class;
    }

    @Override
    public boolean isValid( Field field, String value ) {
        Equals annotation = field.getAnnotation( Equals.class );
        if( !value.equals( annotation.value() ) ) {
            this.message = String.format( "The property '%s' with the value '%s' is not equal to '%s'.", field.getName(), annotation.value(), value  );
            return false;
        }
        return true;
    }
}