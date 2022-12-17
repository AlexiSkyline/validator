package com.randomme.classvalidator.validators;

import com.randomme.classvalidator.validators.array.SizeValidator;
import com.randomme.classvalidator.validators.common.IsNotNullValidator;
import com.randomme.classvalidator.validators.number.*;
import com.randomme.classvalidator.validators.string.*;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class ValidatorRegistry {
    private static Map<Class<?>, Validator> validators = new HashMap<>();

    static {
        register( new SizeValidator() );

        register( new IsNotNullValidator() );

        register( new IntRangeValidator() );
        register( new DoubleRangeValidator() );
        register( new FloatRangeValidator() );
        register( new LongRangeValidator() );
        register( new IsNegativeValidator() );
        register( new IsPositiveValidator() );

        register( new ContainsValidator() );
        register( new EqualsValidator() );
        register( new EqualsIgnoreCaseValidator() );
        register( new IsDateStringValidator() );
        register( new IsEmailValidator() );
        register( new IsLowerCaseValidator() );
        register( new IsNotEmptyValidator() );
        register( new IsUpperCaseValidator() );
        register( new NotContainsValidator() );
    }

    public static void register( Validator validator ) {
        validators.put( validator.getAnnotation(), validator );
    }

    public static Validator getValidatorForClass( Class<?> annotation ) {
        return validators.get( annotation );
    }

    public static Collection<Validator> getValidators() {
        return validators.values();
    }
}