package com.startjava.lesson_2_3.method.naming;

public class MethodName {
    public static String getCurrent() {
        return Thread.currentThread().getStackTrace()[2].getMethodName();
    }
}