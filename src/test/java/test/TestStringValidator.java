package test;

import com.randomme.classvalidator.ClassValidator;
import com.randomme.classvalidator.Result;
import data.string.StringCorrect;
import data.string.StringError;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName( "String Test Validator" )
public class TestStringValidator {
    ClassValidator validator;
    Result result;

    @Test
    @DisplayName( "Testing String validation with correct fields" )
    void TestStringValidatorCorrect() {
        this.validator = new ClassValidator();
        StringCorrect correctData = new StringCorrect();
        this.result = validator.validate( correctData );

        assertThrows( IndexOutOfBoundsException.class, () -> this.result.getErrorByIndex(10) );
        assertEquals( this.result.getErrorList().size(), 0 );
        assertTrue( this.result.isValid() );
        assertTrue( this.result.getErrorList().isEmpty() );
    }

    @Test
    @DisplayName( "Testing String validation with incorrect fields" )
    void TestStringValidatorIncorrect() {
        this.validator = new ClassValidator();
        StringError incorrectData = new StringError();
        this.result = validator.validate( incorrectData );

        assertFalse( this.result.isValid() );
        assertTrue( this.result.getErrorList().size() > 0 );
        assertFalse( this.result.getErrorList().isEmpty() );
        assertEquals( this.result.getErrorList().get(0).getMessage(), "The Property 'contains' does not contain Cars" );
        assertEquals( this.result.getErrorList().get(5).getMessage(), "The value of the property 'lowerCase' is not Lowercase" );
        assertEquals( this.result.getErrorList().get(7).getMessage(), "The property 'isNotEmpty' is empty." );
        assertTrue( this.result.getErrorList().get(1).getMessage().contains( "equalsIgnoreCase" ));
        assertTrue( this.result.getErrorList().get(6).getMessage().contains( "upperCase" ));
    }
}