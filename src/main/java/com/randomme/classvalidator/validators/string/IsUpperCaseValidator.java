package com.randomme.classvalidator.validators.string;

import com.randomme.classvalidator.annotations.string.IsUpperCase;
import com.randomme.classvalidator.utils.StringUtils;
import com.randomme.classvalidator.validators.StringValidator;

import java.lang.reflect.Field;

public class IsUpperCaseValidator extends StringValidator {
    @Override
    public Class<?> getAnnotation() {
        return IsUpperCase.class;
    }

    @Override
    public boolean isValid( Field field, String value ) {
        return StringUtils.isUpperCase( value );
    }
}