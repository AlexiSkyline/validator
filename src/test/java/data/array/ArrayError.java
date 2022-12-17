package data.array;

import com.randomme.classvalidator.annotations.array.Size;

public class ArrayError {
    @Size( min = 10, max = 20 )
    public char[] letter = { 'A', 'B', 'C' };

    @Size( min = 1, max = 3 )
    public final String[] names = { "Charles", "Hellen", "Lucas", "Luis" };

    @Size( max = 2 )
    public int[] randomsNums = { 10, 20, 11 };
}