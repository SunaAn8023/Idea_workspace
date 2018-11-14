package com.zwy.pattern.search.strategy.impl;

import com.zwy.pattern.search.strategy.ISearchStrategy;
import lombok.extern.java.Log;

/**
 * 顺序查找
 * author:zwy
 * Date:2018/11/14
 * Time:09:58
 */
@Log
public class SequenceSearch implements ISearchStrategy {

    @Override
    public int search(int target, int[] array) {

        for (int i = 0; i < array.length; i++) {
            if (target==array[i]) {
                log.info("查找成功:"+i+",消耗成本:"+i);
                return i;
            }
        }
        log.info("查找失败,消耗成本:"+array.length);
        return 0;
    }
}
