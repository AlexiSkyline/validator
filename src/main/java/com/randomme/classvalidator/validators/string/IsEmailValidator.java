package com.randomme.classvalidator.validators.string;

import com.randomme.classvalidator.annotations.string.IsEmail;
import com.randomme.classvalidator.utils.StringUtils;
import com.randomme.classvalidator.validators.StringValidator;

import java.lang.reflect.Field;

public class IsEmailValidator extends StringValidator {
    @Override
    public Class<?> getAnnotation() {
        return IsEmail.class;
    }

    @Override
    public boolean isValid( Field field, String value ) {
        return StringUtils.isEmail( value );
    }
}