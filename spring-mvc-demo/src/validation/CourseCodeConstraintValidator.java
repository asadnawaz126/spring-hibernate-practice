package validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class CourseCodeConstraintValidator implements ConstraintValidator<CourseCode, String> {

    private String coursePrefix;
    @Override
    public void initialize(CourseCode constraintAnnotation) {
        coursePrefix = constraintAnnotation.value();
    }

    @Override
    public boolean isValid(String formString, ConstraintValidatorContext constraintValidatorContext) {

        boolean result;
        if(formString!=null)
            result = formString.startsWith(coursePrefix);
        else
            result = false;

        return result;
    }
}
