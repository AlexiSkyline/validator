package test;

import com.randomme.classvalidator.ClassValidator;
import com.randomme.classvalidator.Result;
import data.common.CommonCorrect;
import data.common.CommonError;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertTrue;

@DisplayName( "Common Test Validator" )
public class TestCommonValidator {
    ClassValidator validator;
    Result result;

    @Test
    @DisplayName( "Testing Common validation with correct fields" )
    void TestCommonValidatorCorrect() {
        this.validator = new ClassValidator();
        CommonCorrect correctData = new CommonCorrect();
        this.result = this.validator.validate( correctData );

        assertThrows( IndexOutOfBoundsException.class, () -> this.result.getErrorByIndex(10) );
        assertEquals( this.result.getErrorList().size(), 0 );
        assertTrue( this.result.isValid() );
        assertTrue( this.result.getErrorList().isEmpty() );
    }

    @Test
    @DisplayName( "Testing Common validation with incorrect fields" )
    void TestCommonValidatorIncorrect() {
        this.validator = new ClassValidator();
        CommonError correctData = new CommonError();
        this.result = this.validator.validate( correctData );

        assertFalse( this.result.isValid() );
        assertEquals( this.result.getErrorList().size(), 5 );
        assertEquals( this.result.getErrorList().get(0).getMessage(), "The field 'notNull' is a Null value." );
        assertEquals( this.result.getErrorList().get(1).getMessage(), "The field 'name' is a Null value." );
        assertTrue( this.result.getErrorList().get(0).getMessage().contains( "is a Null value" ));
        assertFalse( this.result.getErrorList().isEmpty() );
    }
}