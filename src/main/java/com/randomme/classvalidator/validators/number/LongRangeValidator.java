package com.randomme.classvalidator.validators.number;

import com.randomme.classvalidator.annotations.number.LongRange;
import com.randomme.classvalidator.utils.NumberUtils;
import com.randomme.classvalidator.validators.NumberValidator;

import java.lang.reflect.Field;

public class LongRangeValidator extends NumberValidator {
    private final String localMessage = "Property '%s' is outside the range";

    @Override
    public Class<?> getAnnotation() {
        return LongRange.class;
    }

    @Override
    public boolean isValid( Field field, Number value ) {
        LongRange range = field.getAnnotation( LongRange.class );
        if( NumberUtils.isRange( value, range.min(), range.max() ) ) {
            this.message = String.format( this.localMessage, field.getName() );
            return false;
        }
        return true;
    }
}