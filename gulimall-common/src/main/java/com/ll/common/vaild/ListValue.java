package com.ll.common.vaild;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.*;
import static java.lang.annotation.ElementType.TYPE_USE;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

/**
 * 声明自定义注解
 * */
@Documented
@Constraint(validatedBy = { ListValueConstraintValidator.class })
@Target({ METHOD, FIELD, ANNOTATION_TYPE, CONSTRUCTOR, PARAMETER, TYPE_USE })
@Retention(RUNTIME)
public @interface ListValue {
    //校验不通过的时候打印的信息
    String message() default "{com.ll.common.valid.ListValue.message}";
    //校验组，用于分组校验
    Class<?>[] groups() default { };
    //负载信息
    Class<? extends Payload>[] payload() default { };
    //自定义数组校验规则
    int[] vals() default { };
}
