package com.li.annotation_reflection.refelec;

/**
 * @author : LiWenBo
 * @program : annotation_reflection
 * @description :
 * @date : 2020-11-29 14:06:00
 */
public class Test04 {
    public static void main(String[] args) {
        A a = new A();
        System.out.println(A.m);
    }
}

class A{
    static {
        System.out.println("A类的静态代码块初始化");
        m = 300;
    }
    static int m = 100;
    public A(){
        System.out.println("A类的无参构造初始化");
    }
}