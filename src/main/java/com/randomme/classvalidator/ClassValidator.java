package com.randomme.classvalidator;

import com.randomme.classvalidator.validators.Validator;
import com.randomme.classvalidator.validators.ValidatorRegistry;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Objects;

public class ClassValidator {
    public Result validate( Object instance ) {
        Result result = new Result();
        Class<?> informationClass = instance.getClass();

        Arrays.stream( informationClass.getDeclaredFields() ).forEach( field -> {
            Error error = this.errorDetectionValidator( field, instance );
            if ( error != null ) {
                result.addError( error );
            }
        });

        return result;
    }

    private Error errorDetectionValidator( Field field, Object instance ) {
        try {
            Object value = field.get( instance );

            return Arrays.stream( field.getAnnotations() )
                    .map( annotation -> ValidatorRegistry.getValidatorForClass( annotation.annotationType() ))
                    .filter( Objects::nonNull )
                    .filter( validator -> !validator.isValid( field, value ))
                    .findFirst()
                    .map( validator -> new Error( field.getName(), value, validator.getName(), validator.getMessage() ))
                    .orElse( null );
        } catch ( IllegalArgumentException | IllegalAccessException e ) {
            e.printStackTrace();
        }

        return null;
    }
}