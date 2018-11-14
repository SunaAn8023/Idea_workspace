package com.zwy.pattern.sort.strategy.impl;

import com.zwy.pattern.sort.strategy.ISortStrategy;
import lombok.extern.java.Log;

/**
 * 折半排序，升序
 * author:zwy
 * Date:2018/11/14
 * Time:11:01
 */
@Log
public class BinaryInsertSort implements ISortStrategy{

    private static int cost = 0;

    @Override
    public int[] sort(int[] array) {

        int tmp = 0;
        int high = 0;
        int low = 0;
        int mid = 0;

        for (int i = 1; i < array.length; i++) {

            if (array[i]<array[i-1]){
                cost++;
                tmp = array[i];

                //折半查找
                high = i-1;
                low = 0;
                while (low<=high){
                    cost++;
                    mid = (low+high)/2;

                    if(array[mid]>tmp){
                        high = mid-1;
                    }else{
                        low = mid+1;
                    }
                }

                for (int j = i-1; j >= high+1 ; j--) {
                    array[j+1] = array[j];
                }

                array[high+1] = tmp;
            }

        }
        log.info("消耗成本:"+cost);
        return array;
    }
}
