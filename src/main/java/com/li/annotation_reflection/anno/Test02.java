package com.li.annotation_reflection.anno;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

/**
 * @author : LiWenBo
 * @program : annotation_reflection
 * @description : 自定义注解
 * @date : 2020-11-28 16:36:37
 */
public class Test02 {

    // 注解可以显式复制，如果没有默认值 必须要给注解赋值
    @MyAnno2()
    public void test() {

    }
}

@Target(value = {ElementType.TYPE, ElementType.METHOD})
@interface MyAnno2 {
    // 注解的参数：参数的类型 + 参数名();
    String name() default "";

    int age() default 0;

    int id() default -1;

    String[] school() default {"北京大学", "清华大学"};
}