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
        if( !value.contains( annotation.value() ) ) {
            this.message = String.format( "The value of the property '%s' does not contain the value '%s' in '%s'.", field.getName(), annotation.value(), value );
            return false;
        }
        return true;
    }
}