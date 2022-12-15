package com.randomme.classvalidator.validators.number;

import com.randomme.classvalidator.annotations.number.IntRange;
import com.randomme.classvalidator.utils.NumberUtils;
import com.randomme.classvalidator.validators.NumberValidator;

import java.lang.reflect.Field;

public class IntRangeValidator extends NumberValidator {
    @Override
    public Class<?> getAnnotation() {
        return IntRange.class;
    }

    @Override
    public boolean isValid( Field field, int value ) {
        IntRange range = field.getAnnotation( IntRange.class );
        return NumberUtils.isRange( value, range.min(), range.max() );
    }

    @Override
    public boolean isValid( Field field, long value ) {
        IntRange range = field.getAnnotation( IntRange.class );
        return NumberUtils.isRange( value, range.min(), range.max() );
    }

    @Override
    public boolean isValid( Field field, float value ) {
        IntRange range = field.getAnnotation( IntRange.class );
        return NumberUtils.isRange( value, range.min(), range.max() );
    }

    @Override
    public boolean isValid( Field field, double value ) {
        IntRange range = field.getAnnotation( IntRange.class );
        return NumberUtils.isRange( value, range.min(), range.max() );
    }
}