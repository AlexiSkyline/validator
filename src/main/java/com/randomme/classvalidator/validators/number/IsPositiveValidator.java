package com.randomme.classvalidator.validators.number;

import com.randomme.classvalidator.annotations.number.IsPositive;
import com.randomme.classvalidator.utils.NumberUtils;
import com.randomme.classvalidator.validators.NumberValidator;

import java.lang.reflect.Field;

public class IsPositiveValidator extends NumberValidator {
    @Override
    public Class<?> getAnnotation() {
        return IsPositive.class;
    }

    @Override
    public boolean isValid( Field field, int value ) {
        return NumberUtils.isPositive( value );
    }

    @Override
    public boolean isValid( Field field, long value ) {
        return NumberUtils.isPositive( value );
    }

    @Override
    public boolean isValid( Field field, float value ) {
        return NumberUtils.isPositive( value );
    }

    @Override
    public boolean isValid( Field field, double value ) {
        return NumberUtils.isPositive( value );
    }
}