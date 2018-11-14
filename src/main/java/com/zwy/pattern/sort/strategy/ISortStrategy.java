package com.zwy.pattern.sort.strategy;

/**
 * 排序策略
 * author:zwy
 * Date:2018/11/14
 * Time:10:22
 */
public interface ISortStrategy {

    /**
     * 排序策略
     * @param array     目标
     * @return      结果
     */
    int[] sort(int[] array);
}
