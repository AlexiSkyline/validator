package test;

import com.randomme.classvalidator.ClassValidator;
import com.randomme.classvalidator.Result;
import data.array.ArrayCorrect;
import data.array.ArrayError;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName( "Array Test Validator" )
public class TestArrayValidator {
    ClassValidator validator;
    Result result;

    @Test
    @DisplayName( "Testing array validation with correct input" )
    void TestArrayValidatorCorrect() {
        this.validator = new ClassValidator();
        ArrayCorrect correctData = new ArrayCorrect();
        this.result = validator.validate( correctData );

        assertTrue( this.result.isValid() );
        assertEquals( this.result.getErrorList().size(), 0 );
        assertTrue( this.result.getErrorList().isEmpty() );
        assertThrows( IndexOutOfBoundsException.class, () -> this.result.getErrorByIndex(0) );
    }

    @Test
    @DisplayName( "Testing array validation with Incorrect input" )
    void TestArrayValidatorIncorrect() {
        this.validator = new ClassValidator();
        ArrayError incorrectData = new ArrayError();
        this.result = validator.validate( incorrectData );

        assertFalse( this.result.isValid() );
        assertTrue( this.result.getErrorList().size() > 0 );
        assertFalse( this.result.getErrorList().isEmpty() );
        assertTrue( this.result.getErrorByIndex(0).getMessage().contains( "Array must have a minimum of" )  );
    }
}