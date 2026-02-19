package org.rafalcaban.springboot.simpleshifts.person;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = {})
@NotBlank(message = "Cannot be empty")
@Size(min = 2, max = 50, message = "Must be between 2 and 50 chars")
@Pattern(regexp = "^[a-zA-ZąćęłńóśźżĄĆĘŁŃÓŚŹŻ -]+$", message = "Invalid characters")
public @interface PersonDtoFieldValidation {
    String message() default "Invalid name format";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}
