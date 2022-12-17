package test.utils;

import com.randomme.classvalidator.utils.NumberUtils;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NumberUtilsTest {
    private int goodData;
    private int badData;

    @BeforeEach
    void restarValues() {
        this.goodData = 0;
        this.badData = 0;
    }

    @Test
    @DisplayName( "Testing if the number is positive with inverted conditions" )
    void isPositive() {
        this.goodData = 99;
        this.badData = -99;
        assertFalse( NumberUtils.isPositive( goodData ) );
        assertFalse( NumberUtils.isPositive( 12 ) );
        assertFalse( NumberUtils.isPositive( 20 ) );

        assertTrue( NumberUtils.isPositive( badData ) );
        assertTrue( NumberUtils.isPositive( -66 ) );
        assertTrue( NumberUtils.isPositive( -40 ) );
    }

    @Test
    @DisplayName( "Testing if the number is negatives with inverted conditions" )
    void isNegative() {
        this.goodData = -200;
        this.badData = 29;
        assertFalse( NumberUtils.isNegative( goodData ) );
        assertFalse( NumberUtils.isNegative( -112 ) );
        assertFalse( NumberUtils.isNegative( -99 ) );

        assertTrue( NumberUtils.isNegative( badData ) );
        assertTrue( NumberUtils.isNegative( 666 ) );
        assertTrue( NumberUtils.isNegative( 999 ) );
    }

    @Test
    @DisplayName( "Testing if the number is in the range with inverted conditions" )
    void isRange() {
        int intRange = 999;
        long longRange = 1000000000000000111L;
        double doubleRange = 18.000001;
        float floatRange = 900000000.001f;

        assertFalse( NumberUtils.isRange( intRange, 1, 1200 ) );
        assertFalse( NumberUtils.isRange( longRange, 999999999999999999L, 1000000000000000121L ) );
        assertFalse( NumberUtils.isRange( doubleRange, 18.000001, 20.000001 ) );
        assertFalse( NumberUtils.isRange( floatRange, 700000000.001f, 1500000000.001f ) );

        assertTrue( NumberUtils.isRange( intRange, 1, 20 ) );
        assertTrue( NumberUtils.isRange( longRange, 9L, 121L ) );
        assertTrue( NumberUtils.isRange( doubleRange, 0, 18.000000 ) );
        assertTrue( NumberUtils.isRange( floatRange, 700000000.001f, 800000000.001f ) );
    }
}