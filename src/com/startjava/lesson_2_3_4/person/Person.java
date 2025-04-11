package com.startjava.lesson_2_3_4.person;

public class Person {
    String gender = "мужской";
    String name = "Андрей";
    int height = 179;
    float weight = 94.3f;
    int age = 31;

    void walk() {
        System.out.println(name + " идёт");
    }

    void sit() {
        System.out.println(name + " сидит");
    }

    void run() {
        System.out.println(name + " бежит");
    }

    void talk() {
        System.out.println(name + " говорит");
    }

    void learnJava() {
        System.out.println(name + "учит Java");
    }
}