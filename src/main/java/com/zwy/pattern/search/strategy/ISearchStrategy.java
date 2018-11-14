package com.zwy.pattern.search.strategy;

/**
 * author:yym
 * Date:2018/11/14
 * Time:09:53
 */
public interface ISearchStrategy {

    /**
     * 查找策略
     * @param target    目标
     * @param array     查找源
     * @return  目标所在下标
     */
    int search(int target,int[] array);
}
