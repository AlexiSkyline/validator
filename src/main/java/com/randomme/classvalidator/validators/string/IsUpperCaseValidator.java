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
        if( !StringUtils.isUpperCase( value ) ) {
            this.message = String.format( "The value of the property '%s' is not UpperCase", field.getName() );
            return false;
        }
        return true;
    }
}