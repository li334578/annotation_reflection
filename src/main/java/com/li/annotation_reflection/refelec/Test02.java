package com.li.annotation_reflection.refelec;

/**
 * @author : LiWenBo
 * @program : annotation_reflection
 * @description : 测试Class类的创建方式
 * @date : 2020-11-29 13:47:51
 */
public class Test02 {
    public static void main(String[] args) throws ClassNotFoundException {
        Person person = new Student();
        System.out.println("这个人是" + person.getName());
        // 通过对象获得
        Class c1 = person.getClass();
        // forName
        Class c2 = Class.forName("com.li.annotation_reflection.refelec.Student");
        System.out.println(c1.hashCode());
        System.out.println(c2.hashCode());
        // 通过类名.class
        Class c3 = Student.class;
        System.out.println(c3.hashCode());
        // 基本内置类型的包装类
        Class<Integer> c4 = Integer.TYPE;
        System.out.println(c4);
        // 获得父类类型
        Class superclass1 = c1.getSuperclass();
        System.out.println(superclass1);

    }
}

class Person {
    private String name;

    public Person() {
    }

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                '}';
    }
}

class Student extends Person {
    public Student() {
        this.setName("学生");
    }
}

class Teacher extends Person {
    public Teacher() {
        this.setName("老师");
    }
}