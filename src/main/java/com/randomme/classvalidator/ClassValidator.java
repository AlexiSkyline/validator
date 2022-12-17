package com.randomme.classvalidator;

import com.randomme.classvalidator.validators.Validator;
import com.randomme.classvalidator.validators.ValidatorRegistry;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;

public class ClassValidator {
    public Error validate( Field field, Object instance ) {
        try {
            Object value = field.get( instance );

            for ( Annotation annotation : field.getAnnotations() ) {
                Validator validator = ValidatorRegistry.getValidatorForClass( annotation.annotationType() );

                if ( validator != null ) {
                    if ( !validator.isValid( field, value ) ) {
                        return new Error( field.getName(), value, validator.getName(), validator.getMessage() );
                    }
                }
            }
        } catch ( IllegalArgumentException | IllegalAccessException e ) {
            e.printStackTrace();
        }

        return null;
    }

    public Result validate( Object instance ) {
        Result result = new Result();
        Class<?> clazz = instance.getClass();

        for ( Field field : clazz.getDeclaredFields() ) {
            Error error = this.validate( field, instance );
            if ( error != null ) {
                result.addError( error );
            }
        }

        return result;
    }
}
