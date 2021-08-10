package com.fanyang.java.annotation;

import javax.annotation.Resource;
import java.lang.annotation.*;
import java.lang.reflect.Method;

import static java.lang.annotation.ElementType.*;

@Inherited//被它修饰的 Annotation 将具继承性。
@Repeatable(MyFirstAnnotations.class)
@Retention(RetentionPolicy.RUNTIME)//指定所修饰的 Annotation 的生命周期：SOURCE\CLASS（默认行为)\RUNTIME只声明为RUNTIME生命周期的注解，才能通过反射获取。
@Target({TYPE, FIELD, METHOD, PARAMETER, CONSTRUCTOR, LOCAL_VARIABLE, TYPE_PARAMETER, TYPE_USE})
//@Documented//表示所修饰的注解在被javadoc解析时，保留下来。
public @interface MyFirstAnnotation {
    String value() default "hello";
}
