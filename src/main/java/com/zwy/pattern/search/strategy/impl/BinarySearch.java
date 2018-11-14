package com.zwy.pattern.search.strategy.impl;

import com.zwy.pattern.search.strategy.ISearchStrategy;
import lombok.extern.java.Log;

/**
 * 折半查找策略
 * author:zwy
 * Date:2018/11/14
 * Time:10:00
 */
@Log
public class BinarySearch implements ISearchStrategy {

    private static int cost = 0;    //复杂度

    @Override
    public int search(int target, int[] array) {

        int low = 0;    //高位
        int high = array.length-1;     //地位
        int mid = 0;    //中间位

        while(low<=high){
            cost++;
            mid = (low+high)/2;

            //查找
            if(target==array[mid]){
                log.info("查找成功:"+mid+",消耗成本:"+cost);
                return mid;
            }

            if (target>array[mid]){
                low = mid+1;
            }

            if (target<array[mid]){
                high = mid-1;
            }
        }

        log.info("查找失败,消耗成本:"+cost);
        return 0;
    }
}
