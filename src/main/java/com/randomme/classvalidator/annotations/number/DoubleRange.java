package com.randomme.classvalidator.annotations.number;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

@Retention( RUNTIME )
@Target( FIELD )
public @interface DoubleRange {
    public double max() default Double.MAX_VALUE;
    public double min() default Double.MIN_VALUE;
}