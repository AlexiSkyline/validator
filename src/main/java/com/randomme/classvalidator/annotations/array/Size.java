package com.randomme.classvalidator.annotations.array;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

/**
 The @Size annotation is used to specify the minimum and maximum allowed size for a field of a Java class.
 The annotation is retained at runtime and can be used to validate the size of the field at runtime.
 The default values for the minimum and maximum size are 0 and Integer.MAX_VALUE, respectively. This means that the size of the field can be any positive integer (including zero) by default.
*/
@Retention( RUNTIME )
@Target( FIELD )
public @interface Size {
    int min() default 0;
    int max() default Integer.MAX_VALUE;
}