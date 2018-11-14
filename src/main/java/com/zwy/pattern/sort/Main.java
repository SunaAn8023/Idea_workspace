package com.zwy.pattern.sort;

import com.zwy.pattern.sort.strategy.ISortStrategy;
import com.zwy.pattern.sort.strategy.impl.BubbleSort;

/**
 * author:zwy
 * Date:2018/11/14
 * Time:11:00
 */
public class Main {

    public static void main(String[] args) {
        ISortStrategy sortStrategy = new BubbleSort();
        int[] array = sortStrategy.sort(new int[]{2,4,5,34,1,75,34,234,23});


        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

    }
}
