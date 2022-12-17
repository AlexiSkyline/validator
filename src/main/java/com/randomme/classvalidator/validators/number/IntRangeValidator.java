package com.randomme.classvalidator.validators.number;

import com.randomme.classvalidator.annotations.number.IntRange;
import com.randomme.classvalidator.utils.NumberUtils;
import com.randomme.classvalidator.validators.NumberValidator;

import java.lang.reflect.Field;

public class IntRangeValidator extends NumberValidator {
    private final String localMessage = "Property '%s' is outside the range";
    @Override
    public Class<?> getAnnotation() {
        return IntRange.class;
    }

    @Override
    public boolean isValid( Field field, int value ) {
        IntRange range = field.getAnnotation( IntRange.class );
        if( NumberUtils.isRange( value, range.min(), range.max() ) ) {
            this.message = String.format( this.localMessage, field.getName() );
            return false;
        }
        return true;
    }

    @Override
    public boolean isValid( Field field, long value ) {
        IntRange range = field.getAnnotation( IntRange.class );
        if( NumberUtils.isRange( value, range.min(), range.max() ) ) {
            this.message = String.format( this.localMessage, field.getName() );
            return false;
        }
        return true;
    }

    @Override
    public boolean isValid( Field field, float value ) {
        IntRange range = field.getAnnotation( IntRange.class );
        if( NumberUtils.isRange( value, range.min(), range.max() ) ) {
            this.message = String.format( this.localMessage, field.getName() );
            return false;
        }
        return true;
    }

    @Override
    public boolean isValid( Field field, double value ) {
        IntRange range = field.getAnnotation( IntRange.class );
        if( NumberUtils.isRange( value, range.min(), range.max() ) ) {
            this.message = String.format( this.localMessage, field.getName() );
            return false;
        }
        return true;
    }
}