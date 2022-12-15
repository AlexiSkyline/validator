package com.randomme.classvalidator.annotations.number;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

@Retention( RUNTIME )
@Target( FIELD )
public @interface FloatRange {
    public float max() default Float.MAX_VALUE;
    public float min() default Float.MIN_VALUE;
}