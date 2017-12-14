package com.answer_05.javademo.class_loader;

/**
 * @creator : answer_05
 * @create-time : 2017/11/24 上午10:40
 * @description :
 */

public class Person {
    static{
        System.out.println("person static");
    }
    public Person(String str) {
        System.out.println("person "+str);
    }
}
