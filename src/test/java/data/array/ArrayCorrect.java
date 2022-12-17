package data.array;

import com.randomme.classvalidator.annotations.array.Size;

public class ArrayCorrect {
    @Size( min = 1, max = 3 )
    public char[] letter = { 'A', 'B', 'C' };

    @Size( min = 1, max = 20 )
    public String[] names = { "Charles", "Hellen", "Lucas", "Luis" };

    @Size( max = 20 )
    public int[] randomsNums = { 10, 20, 11 };
}