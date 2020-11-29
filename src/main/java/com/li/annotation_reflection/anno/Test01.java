package com.li.annotation_reflection.anno;

import java.lang.annotation.*;

/**
 * @author : LiWenBo
 * @program : annotation_reflection
 * @description : 测试元注解
 * @date : 2020-11-28 16:29:11
 */
@MyAnno
public class Test01 {
    @MyAnno
    public void test() {

    }
}

// 自定义一个注解
// Target 注解可以用在哪些地方
@Target(value = {ElementType.METHOD, ElementType.TYPE})
// Retention 注解在什么地方还有效
@Retention(value = RetentionPolicy.RUNTIME)
// 是否将注解生成到JavaDoc中
@Documented
// 继承是否有效
@Inherited
@interface MyAnno {

}