package com.zwy.pattern.sort.strategy.impl;

import com.zwy.pattern.sort.strategy.ISortStrategy;
import lombok.extern.java.Log;

/**
 * shell 排序
 * author:zwy
 * Date:2018/11/14
 * Time:13:59
 */
@Log
public class ShellSort implements ISortStrategy {

    private static int cost = 0;

    @Override
    public int[] sort(int[] array) {
        int tmp = 0;
        //最大跨度不能超过 n/3，否则会有多个子表 存在 元素小于3的情况，无意义
        int dk = array.length/3;
        while (dk>0){
            //遍历n个子表
            for (int i = 0; i < dk; i++) {
                for (int j = dk+i; j < array.length; j = j+dk) {
                    if(array[j]<array[j-dk]){
                        cost++;
                        tmp = array[j];
                        int k = 0;
                        for (k = j-dk; k>=0 && tmp<array[k]; k=k-dk) {
                            cost++;
                            array[k+dk] = array[k];
                        }
                        array[k+dk] = tmp;
                    }
                }
            }
            dk = dk/3;
        }
        log.info("消耗成本:"+cost);
        return array;
    }
}
