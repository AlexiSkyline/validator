package com.randomme.classvalidator.validators.number;

import com.randomme.classvalidator.annotations.number.IsPositive;
import com.randomme.classvalidator.utils.NumberUtils;
import com.randomme.classvalidator.validators.NumberValidator;

import java.lang.reflect.Field;

public class IsPositiveValidator extends NumberValidator {
    private final String localMessage = "The value of the property '%s' is Negative, must be positive";

    @Override
    public Class<?> getAnnotation() {
        return IsPositive.class;
    }

    @Override
    public boolean isValid( Field field, int value ) {
        if( !NumberUtils.isPositive( value ) ) {
            this.message = String.format( this.localMessage, field.getName() );
            return false;
        }
        return true;
    }

    @Override
    public boolean isValid( Field field, long value ) {
        if( !NumberUtils.isPositive( value ) ) {
            this.message = String.format( this.localMessage, field.getName() );
            return false;
        }
        return true;
    }

    @Override
    public boolean isValid( Field field, float value ) {
        if( !NumberUtils.isPositive( value ) ) {
            this.message = String.format( this.localMessage, field.getName() );
            return false;
        }
        return true;
    }

    @Override
    public boolean isValid( Field field, double value ) {
        if( !NumberUtils.isPositive( value ) ) {
            this.message = String.format( this.localMessage, field.getName() );
            return false;
        }
        return true;
    }
}