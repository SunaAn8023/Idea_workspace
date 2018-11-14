package com.zwy.pattern.sort.strategy.impl;

import com.zwy.pattern.sort.strategy.ISortStrategy;
import lombok.extern.java.Log;

/**
 * author:zwy
 * Date:2018/11/14
 * Time:15:48
 */
@Log
public class BubbleSort  implements ISortStrategy{

    @Override
    public int[] sort(int[] array) {
        int tmp = 0;
        for (int i = 1; i < array.length; i++) {
            for (int j = 0; j < array.length-i; j++) {
                if(array[j]>array[j+1]){
                    tmp = array[j+1];
                    array[j+1] = array[j];
                    array[j] = tmp;
                }

            }
        }

        return array;
    }
}
