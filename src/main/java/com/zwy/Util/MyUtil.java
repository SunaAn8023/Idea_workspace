package com.zwy.Util;

/**
 * author:zwy
 * Date:2018/11/9
 * Time:16:48
 */
public class MyUtil {

    public static int[] integerArrayToIntArray(Integer[] array){
        int[] result = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            result[i] = array[i];
        }
        return result;
    }
}
