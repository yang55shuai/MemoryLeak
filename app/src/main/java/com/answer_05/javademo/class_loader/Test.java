package com.answer_05.javademo.class_loader;

/**
 * @creator : answer_05
 * @create-time : 2017/11/24 上午10:39
 * @description :
 */

public class Test {

    Person person = new Person("Test");
    static{
        System.out.println("test static");
    }

    public Test() {
        System.out.println("test constructor");
    }

    public static void main(String[] args) {
        new MyClass();
    }
}
