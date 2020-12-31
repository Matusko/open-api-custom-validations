package sk.matusko.tutorial.openapicustomvalidations.validators;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class EvenLongValidator implements ConstraintValidator<EvenLong, Long> {

    @Override
    public void initialize(EvenLong contactNumber) {
    }

    @Override
    public boolean isValid(Long num, ConstraintValidatorContext constraintValidatorContext) {
        return num == null || num % 2 == 0;
    }

}