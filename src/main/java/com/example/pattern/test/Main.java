package com.example.pattern.test;

/**
 * author:zwy
 * Date:2018/7/17
 * Time:18:06
 */
public class Main {

    public static void f(int a){
        a++;
        System.out.println(a);
    }

    public static void main(String[] args) {
        int a = 10;
        f(a);
        System.out.println(a);
    }
}
