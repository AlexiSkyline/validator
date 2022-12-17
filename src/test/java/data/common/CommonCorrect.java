package data.common;

import com.randomme.classvalidator.annotations.common.IsNotNull;

public class CommonCorrect {
    @IsNotNull
    public String notNull = "is not null";
    @IsNotNull
    public String name = "Juan";
    @IsNotNull
    public String color = "red";
    @IsNotNull
    public int day = 12;
    @IsNotNull
    public int[] mySimpleArray = new int[3];
}