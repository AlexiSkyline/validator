package com.randomme.classvalidator.annotations.number;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

@Retention( RUNTIME )
@Target( FIELD )
public @interface IntRange {
    public int max() default Integer.MAX_VALUE;
    public int min() default Integer.MIN_VALUE;
}