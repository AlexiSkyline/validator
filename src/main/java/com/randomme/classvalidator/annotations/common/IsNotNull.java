package com.randomme.classvalidator.annotations.common;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

/**
 The @IsNotEmpty annotation is used to verify that the property is not null.
 The annotation is retained at runtime and can be used to validate the field size at runtime.
*/
@Retention( RUNTIME )
@Target( FIELD )
public @interface IsNotNull {}