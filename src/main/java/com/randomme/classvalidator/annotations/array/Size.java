package com.randomme.classvalidator.annotations.array;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

@Retention( RUNTIME )
@Target( FIELD )
public @interface Size {
    int min() default 0;
    int max() default Integer.MAX_VALUE;
}