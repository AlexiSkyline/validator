package data.string;

import com.randomme.classvalidator.annotations.string.*;

public class StringError {
    @Contains( "Cars" )
    public String contains = "Hello, Welcome to the Page";
    @EqualsIgnoreCase( "Hola Ignore Case Fail" )
    public String equalsIgnoreCase = "hola IgnorE CASE";
    @Equals( "Is Equals Real" )
    public String equals = "Is Equals Fail";
    @IsDateString
    public String dateString = "23-11-2001";
    @IsEmail
    public String email = "alexis_skyline a outlook.com";
    @IsLowerCase
    public String lowerCase = "LOWERCASE";
    @IsUpperCase
    public String upperCase = "uppercase";
    @IsNotEmpty
    public String isNotEmpty = "";
    @NotContains( "For" )
    public String notContains = "Tanks For You";
}