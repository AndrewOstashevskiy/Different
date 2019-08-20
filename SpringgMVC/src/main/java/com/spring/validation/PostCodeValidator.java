package com.spring.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class PostCodeValidator implements ConstraintValidator<PostCode, String> {

    private String postalCodePrefix; //LUV

    @Override
    public void initialize(PostCode thePostCode) {
        postalCodePrefix = thePostCode.value();
    }

    @Override
    public boolean isValid(String userInput, ConstraintValidatorContext context) {

        boolean result;

        if (userInput != null){
        result = userInput.startsWith(postalCodePrefix);

        } else{
            result = true;
        }
        return result;
    }
}
