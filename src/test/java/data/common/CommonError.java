package data.common;

import com.randomme.classvalidator.annotations.common.IsNotNull;

public class CommonError {
    @IsNotNull
    public String notNull;
    @IsNotNull
    public String name = null;
    @IsNotNull
    public String color = this.name;
    @IsNotNull
    public Integer day;
    @IsNotNull
    public int[] mySimpleArray = null;
}