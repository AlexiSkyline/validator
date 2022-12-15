package com.randomme.classvalidator.validators.array;

import com.randomme.classvalidator.annotations.array.Size;
import com.randomme.classvalidator.utils.ArrayUtils;
import com.randomme.classvalidator.validators.ArrayValidator;

import java.lang.reflect.Field;

public class SizeValidator extends ArrayValidator {
    @Override
    public Class<?> getAnnotation() {
        return Size.class;
    }

    @Override
    public boolean isValid( Field field, Object[] value ) {
        Size isArrayLength = field.getAnnotation( Size.class );
        return ArrayUtils.isLength( value, isArrayLength.min(), isArrayLength.max() );
    }
}