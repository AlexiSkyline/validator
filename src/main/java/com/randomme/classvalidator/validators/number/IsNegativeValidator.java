package com.randomme.classvalidator.validators.number;

import com.randomme.classvalidator.annotations.number.IsNegative;
import com.randomme.classvalidator.utils.NumberUtils;
import com.randomme.classvalidator.validators.NumberValidator;

import java.lang.reflect.Field;

public class IsNegativeValidator extends NumberValidator {
    private final String localMessage = "The value of the property '%s' is Positive, must be negative";
    @Override
    public Class<?> getAnnotation() {
        return IsNegative.class;
    }

    @Override
    public boolean isValid( Field field, Number value ) {
        if( !NumberUtils.isNegative( value ) ) {
            this.message = String.format( this.localMessage, field.getName() );
            return false;
        }
        return true;
    }
}