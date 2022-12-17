package data.number;

import com.randomme.classvalidator.annotations.number.*;

public class NumberError {
    @IntRange( min = 1, max = 3 )
    public int intRange = 999;
    @LongRange( min = 999999999999999999L, max = 1000000000000000121L )
    public long longRange = 111L;
    @DoubleRange( min = 10.000001, max = 20.000001 )
    public double doubleRange = 181;
    @FloatRange( min = 800000000.001f, max = 10000000000.002f )
    public float floatRange = 600000000.001f;
    @IsNegative
    public int negative = 1;
    @IsPositive
    public int positive = -29;
}