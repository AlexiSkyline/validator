package com.randomme.classvalidator.utils;

public class ArrayUtils {
    public static boolean isLength( Object[] array, int min, int max ) {
        return ( array.length >= min && array.length <= max );
    }
}