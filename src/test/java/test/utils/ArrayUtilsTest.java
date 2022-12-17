package test.utils;

import com.randomme.classvalidator.utils.ArrayUtils;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArrayUtilsTest {
    private String[] goodData;
    private String[] badData;

    @BeforeEach
    void restarValues() {
        this.goodData = new String[]{ "Hola", "Hi", "Sapo"};
        this.badData = new String[]{ "Alma" };
    }

    @Test
    @DisplayName( "Testing if the Array has the corresponding length" )
    void isLength() {
        assertTrue( ArrayUtils.isLength( this.goodData, 1, 20 ) );
        assertTrue( ArrayUtils.isLength( this.goodData, 1, 3 ) );

        assertTrue( ArrayUtils.isLength( this.badData, 1, 20 ) );
        assertTrue( ArrayUtils.isLength( this.badData, 1, 3 ) );
    }
}