package com.randomme.classvalidator.validators.number;

import com.randomme.classvalidator.annotations.number.FloatRange;
import com.randomme.classvalidator.utils.NumberUtils;
import com.randomme.classvalidator.validators.NumberValidator;

import java.lang.reflect.Field;

public class FloatRangeValidator extends NumberValidator {
    private final String localMessage = "Property '%s' is outside the range";

    @Override
    public Class<?> getAnnotation() {
        return FloatRange.class;
    }

    @Override
    public boolean isValid( Field field, int value ) {
        FloatRange range = field.getAnnotation( FloatRange.class );
        if( NumberUtils.isRange( value, range.min(), range.max() ) ) {
            this.message = String.format( this.localMessage, field.getName() );
            return false;
        }
        return true;
    }

    @Override
    public boolean isValid( Field field, long value ) {
        FloatRange range = field.getAnnotation( FloatRange.class );
        if( NumberUtils.isRange( value, range.min(), range.max() ) ) {
            this.message = String.format( this.localMessage, field.getName() );
            return false;
        }
        return true;
    }

    @Override
    public boolean isValid( Field field, float value ) {
        FloatRange range = field.getAnnotation( FloatRange.class );
        if( NumberUtils.isRange( value, range.min(), range.max() ) ) {
            this.message = String.format( this.localMessage, field.getName() );
            return false;
        }
        return true;
    }

    @Override
    public boolean isValid( Field field, double value ) {
        FloatRange range = field.getAnnotation( FloatRange.class );
        if( NumberUtils.isRange( value, range.min(), range.max() ) ) {
            this.message = String.format( this.localMessage, field.getName() );
            return false;
        }
        return true;
    }
}