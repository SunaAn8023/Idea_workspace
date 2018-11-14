package com.zwy.pattern;

/**
 * author:zwy
 * Date:2018/11/14
 * Time:15:28
 */
public class MainTest {

    private static boolean f(int a,int b){
        System.out.println(a+" "+b);
        return a<b;
    }

    public static void main(String[] args) {
        for (int i = 0; f(i,10) ; ++i) {
            System.out.println(i);
        }
    }
}
