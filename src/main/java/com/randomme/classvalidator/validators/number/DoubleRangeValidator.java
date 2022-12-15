package com.randomme.classvalidator.validators.number;

import com.randomme.classvalidator.annotations.number.DoubleRange;
import com.randomme.classvalidator.utils.NumberUtils;
import com.randomme.classvalidator.validators.NumberValidator;

import java.lang.reflect.Field;

public class DoubleRangeValidator extends NumberValidator {
    @Override
    public Class<?> getAnnotation() {
        return DoubleRange.class;
    }

    @Override
    public boolean isValid( Field field, int value ) {
        DoubleRange range = field.getAnnotation( DoubleRange.class );
        return NumberUtils.isRange( value, range.min(), range.max() );
    }

    @Override
    public boolean isValid( Field field, long value ) {
        DoubleRange range = field.getAnnotation( DoubleRange.class );
        return NumberUtils.isRange( value, range.min(), range.max() );
    }

    @Override
    public boolean isValid( Field field, float value ) {
        DoubleRange range = field.getAnnotation( DoubleRange.class );
        return NumberUtils.isRange( value, range.min(), range.max() );
    }

    @Override
    public boolean isValid( Field field, double value ) {
        DoubleRange range = field.getAnnotation( DoubleRange.class );
        return NumberUtils.isRange( value, range.min(), range.max() );
    }
}