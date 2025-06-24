package com.IdealRein.anno;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;
import jakarta.validation.constraints.NotEmpty;

import java.lang.annotation.Documented;
import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import com.IdealRein.validation.StateValidation;

import static java.lang.annotation.ElementType.*;
import static java.lang.annotation.ElementType.TYPE_USE;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

@Documented
@Target({ FIELD})
@Retention(RUNTIME)
@Constraint(validatedBy = { StateValidation.class})
public @interface State {

    String message() default "state参数的值只能是已发布或者草稿";

    Class<?>[] groups() default { };

    Class<? extends Payload>[] payload() default { };
}
