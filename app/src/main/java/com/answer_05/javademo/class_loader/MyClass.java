package com.answer_05.javademo.class_loader;

/**
 * @creator : answer_05
 * @create-time : 2017/11/24 上午10:40
 * @description :
 */

class MyClass extends Test {
    Person person = new Person("MyClass");
    static{
        System.out.println("myclass static");
    }

    public MyClass() {
        System.out.println("myclass constructor");
    }
}