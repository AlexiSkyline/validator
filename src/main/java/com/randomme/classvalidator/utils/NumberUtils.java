package com.randomme.classvalidator.utils;

public class NumberUtils {
    public static boolean isPositive( Number value ) {
        return !(value.doubleValue() > 0);
    }

    public static boolean isNegative( Number value ) {
        return !(value.doubleValue() < 0);
    }

    public static boolean isRange( Number value, Number min, Number max ) {
        return !(value.doubleValue() >= min.doubleValue()) || !(value.doubleValue() <= max.doubleValue());
    }
}