package com.randomme.classvalidator.validators.string;

import com.randomme.classvalidator.annotations.string.IsLowerCase;
import com.randomme.classvalidator.utils.StringUtils;
import com.randomme.classvalidator.validators.StringValidator;

import java.lang.reflect.Field;

public class IsLowerCaseValidator extends StringValidator {
    @Override
    public Class<?> getAnnotation() {
        return IsLowerCase.class;
    }

    @Override
    public boolean isValid( Field field, String value ) {
        if( !StringUtils.isLowerCase( value ) ) {
            this.message = String.format( "The value of the property '%s' is not Lowercase", field.getName() );
            return false;
        }
        return true;
    }
}