package com.zwy.pattern.sort.strategy.impl;

import com.zwy.pattern.sort.strategy.ISortStrategy;
import lombok.extern.java.Log;

/**
 * 直接插入排序，生序
 * author:zwy
 * Date:2018/11/14
 * Time:10:31
 */
@Log
public class DirectInsertSort implements ISortStrategy {

    private static int cost = 0;

    @Override
    public int[] sort(int[] array) {

        int tmp = 0;
        int j = 0;
        for (int i = 1; i < array.length; i++) {

            //跟前面的比，然后后移
            if (array[i]<array[i-1]){
                cost++;
                tmp = array[i];
                //查找插入位置
                for (j = i-1; j>=0&&tmp<array[j];j--) {
                    cost++;
                    array[j+1] = array[j];
                }
                array[j+1] = tmp;
            }
        }

        log.info("消耗成本:"+cost);
        return array;
    }
}
