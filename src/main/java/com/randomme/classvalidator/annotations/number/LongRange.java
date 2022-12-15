package com.randomme.classvalidator.annotations.number;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

@Retention( RUNTIME )
@Target( FIELD )
public @interface LongRange {
    public long max() default Long.MAX_VALUE;
    public long min() default Long.MIN_VALUE;
}