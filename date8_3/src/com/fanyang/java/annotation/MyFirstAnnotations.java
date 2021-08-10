package com.fanyang.java.annotation;

import java.lang.annotation.*;

import static java.lang.annotation.ElementType.*;

@Inherited
@Retention(RetentionPolicy.RUNTIME)
@Target({TYPE, FIELD, METHOD, PARAMETER, CONSTRUCTOR, LOCAL_VARIABLE})
//@Target({TYPE, FIELD, METHOD, PARAMETER, CONSTRUCTOR, LOCAL_VARIABLE, TYPE_USE,TYPE_PARAMETER})
public @interface MyFirstAnnotations {
    MyFirstAnnotation[] value();
}
