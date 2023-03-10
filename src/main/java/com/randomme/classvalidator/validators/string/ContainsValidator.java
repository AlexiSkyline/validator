package com.randomme.classvalidator.validators.string;

import com.randomme.classvalidator.annotations.string.Contains;
import com.randomme.classvalidator.validators.StringValidator;

import java.lang.reflect.Field;

public class ContainsValidator extends StringValidator {
    @Override
    public Class<?> getAnnotation() {
        return Contains.class;
    }

    @Override
    public boolean isValid( Field field, String value ) {
        Contains annotation = field.getAnnotation( Contains.class );
        if( !value.contains( annotation.value() ) ) {
            this.message = String.format( "The Property '%s' does not contain %s", field.getName(), annotation.value() );
            return false;
        }
        return true;
    }
}