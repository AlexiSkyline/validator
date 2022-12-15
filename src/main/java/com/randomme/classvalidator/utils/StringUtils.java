package com.randomme.classvalidator.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class StringUtils {
    public static boolean isDateString( String value ) {
        SimpleDateFormat dateFormat = new SimpleDateFormat( "dd-MM-yyyy HH:mm:ss:ms" );
        dateFormat.setLenient( false );
        try {
            dateFormat.parse(value);
            return true;
        } catch ( ParseException pe ) {
            return false;
        }
    }

    public static boolean isEmail( String value ) {
        return value.matches( "^(.+)@(.+)$" );
    }

    public static boolean isUpperCase( String value ) {
        return value.toUpperCase().equals( value );
    }

    public static boolean isLowerCase( String value ) {
        return value.toLowerCase().equals( value );
    }

    public static boolean isLength( String value, int min, int max ) {
        int length = value.length();
        return length <= max && length >= min;
    }

    public static boolean IsMobilePhone( String value ) {
        return value.matches( "^(\\+\\d{1,3}( )?)?((\\(\\d{3}\\))|\\d{3})[- .]?\\d{3}[- .]?\\d{4}$" );
    }
}