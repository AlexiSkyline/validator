package com.randomme.classvalidator.validators.string;

import com.randomme.classvalidator.annotations.string.IsDateString;
import com.randomme.classvalidator.utils.StringUtils;
import com.randomme.classvalidator.validators.StringValidator;

import java.lang.reflect.Field;

public class IsDateStringValidator extends StringValidator {
    @Override
    public Class<?> getAnnotation() {
        return IsDateString.class;
    }

    @Override
    public boolean isValid( Field field, String value ) {
        return StringUtils.isDateString( value );
    }
}