package com.custom;


import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class RegisterValidator implements ConstraintValidator<Register,String> {

    @Override
    public boolean isValid(String value, ConstraintValidatorContext constraintValidatorContext) {
        if(value!=null && value.equals("admin")) {
            return false;
        }else{
            return true;
        }
    }
}
