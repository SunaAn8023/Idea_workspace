package com.zwy.pattern.search;

import com.zwy.pattern.search.strategy.ISearchStrategy;
import com.zwy.pattern.search.strategy.impl.BinarySearch;
import com.zwy.pattern.search.strategy.impl.SequenceSearch;

/**
 * author:zwy
 * Date:2018/11/14
 * Time:10:09
 */
public class Main {

    public static void main(String[] args) {

        ISearchStrategy searchStrategy = new SequenceSearch();
        searchStrategy.search(5,new int[]{1,3,6,7,5,4,10});

        searchStrategy = new BinarySearch();
        searchStrategy.search(11,new int[]{1,3,5,6,7,8,9,10,12});


    }
}
