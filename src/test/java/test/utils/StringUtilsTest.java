package test.utils;

import com.randomme.classvalidator.utils.StringUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringUtilsTest {
    private String goodData;
    private String badData;

    @BeforeEach
    void restarValues() {
        this.goodData = "";
        this.badData = "";
    }

    @Test
    @DisplayName( "Testing of the time format" )
    void isDateString() {
        this.goodData = "17-12-2022 22:00:00:000";
        this.badData = "17-12-2022";
        Assertions.assertTrue( StringUtils.isDateString( goodData ) );
        assertFalse( StringUtils.isDateString( badData ) );
    }

    @Test
    @DisplayName( "Testing of the Email format" )
    void isEmail() {
        this.goodData = "hernesto@outlook.com";
        this.badData = "User1234";
        assertTrue( StringUtils.isEmail( goodData ) );
        assertFalse( StringUtils.isEmail( badData ) );
    }

    @Test
    @DisplayName( "Testing if the text is in capital letters" )
    void isUpperCase() {
        this.goodData = "hernesto@outlook.com".toUpperCase();
        this.badData = "User1234".toLowerCase();
        assertTrue( StringUtils.isUpperCase( goodData ) );
        assertFalse( StringUtils.isUpperCase( badData ) );
    }

    @Test
    @DisplayName( "Testing if the text is in lowercase letters" )
    void isLowerCase() {
        this.goodData = "hernesto@outlook.com".toLowerCase();
        this.badData = "User1234".toUpperCase();
        assertTrue( StringUtils.isLowerCase( goodData ) );
        assertFalse( StringUtils.isLowerCase( badData ) );
    }

    @Test
    @DisplayName( "Testing if the text has the corresponding size" )
    void isLength() {
        this.goodData = "hernesto@outlook.com";
        this.badData = "1234$";
        assertTrue( StringUtils.isLength( goodData, 5, 20 ));
        assertFalse( StringUtils.isLength( badData, 6, 16 ));
    }

    @Test
    @DisplayName( "Checking if the phone number is correct" )
    void isMobilePhone() {
        this.goodData = "9612345678";
        this.badData = "any number";
        assertTrue( StringUtils.IsMobilePhone( goodData ));
        assertFalse( StringUtils.IsMobilePhone( badData ));
    }
}