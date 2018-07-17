package com.example.pattern.test;

/**
 * author:zwy
 * Date:2018/7/17
 * Time:18:06
 */
public class Main {

    public static void main(String[] args) {
        A a = new A();
        a.a = 10;

        A b = a;
        a.a = 20;
        System.out.println(b.a);


    }
}
