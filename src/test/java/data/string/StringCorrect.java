package data.string;

import com.randomme.classvalidator.annotations.string.*;

public class StringCorrect {
    @Contains( "Hello" )
    public String contains = "Hello, Welcome to the Page";
    @EqualsIgnoreCase( "Hola Ignore Case" )
    public String equalsIgnoreCase = "hola IgnorE CASE";
    @Equals( "Is Equals Real" )
    public String equals = "Is Equals Real";
    @IsDateString
    public String dateString = "23-11-2001 22:00:00:000";
    @IsEmail
    public String email = "alexis_skyline@outlook.com";
    @IsLowerCase
    public String lowerCase = "lowercase is real";
    @IsUpperCase
    public String upperCase = "HELLO WORD";
    @IsNotEmpty
    public String isNotEmpty = "nene";
    @NotContains( "Hello" )
    public String notContains = "Tanks For You";
}