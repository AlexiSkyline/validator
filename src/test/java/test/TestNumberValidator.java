package test;

import com.randomme.classvalidator.ClassValidator;
import com.randomme.classvalidator.Result;
import data.number.NumberCorrect;
import data.number.NumberError;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName( "Number Test Validator" )
public class TestNumberValidator {
    ClassValidator validator;
    Result result;

    @Test
    @DisplayName( "Testing Number validation with correct fields" )
    void TestNumberValidatorCorrect() {
        this.validator = new ClassValidator();
        NumberCorrect correctData = new NumberCorrect();
        this.result = this.validator.validate( correctData );

        assertTrue( this.result.isValid() );
        assertEquals( this.result.getErrorList().size(), 0 );
        assertTrue( this.result.getErrorList().isEmpty() );
        assertThrows( IndexOutOfBoundsException.class, () -> this.result.getErrorByIndex(0) );
    }

    @Test
    @DisplayName( "Testing Number validation with incorrect fields" )
    void TestNumberValidatorIncorrect() {
        this.validator = new ClassValidator();
        NumberError incorrectData = new NumberError();
        this.result = this.validator.validate( incorrectData );

        assertEquals( this.result.getErrorList().size(), 6 );
        assertFalse( this.result.isValid() );
        assertEquals( this.result.getErrorByIndex(0).getMessage(), "Property 'intRange' is outside the range" );
        assertTrue( this.result.getErrorByIndex(1).getMessage().contains( "'longRange' is outside the range" ) );
        assertTrue( this.result.getErrorByIndex(4).getMessage().contains( "is Positive, must be negative" ) );
        assertEquals( this.result.getErrorByIndex(5).getMessage(), "The value of the property 'positive' is Negative, must be positive" );
    }
}