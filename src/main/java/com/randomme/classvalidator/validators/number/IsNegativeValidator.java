package com.randomme.classvalidator.validators.number;

import com.randomme.classvalidator.annotations.number.IsNegative;
import com.randomme.classvalidator.utils.NumberUtils;
import com.randomme.classvalidator.validators.NumberValidator;

import java.lang.reflect.Field;

public class IsNegativeValidator extends NumberValidator {
    @Override
    public Class<?> getAnnotation() {
        return IsNegative.class;
    }

    @Override
    public boolean isValid( Field field, int value ) {
        return NumberUtils.isNegative( value );
    }

    @Override
    public boolean isValid( Field field, long value ) {
        return NumberUtils.isNegative( value );
    }

    @Override
    public boolean isValid( Field field, float value ) {
        return NumberUtils.isNegative( value );
    }

    @Override
    public boolean isValid( Field field, double value ) {
        return NumberUtils.isNegative( value );
    }
}