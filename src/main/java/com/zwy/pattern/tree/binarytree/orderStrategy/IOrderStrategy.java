package com.zwy.pattern.tree.binarytree.orderStrategy;

import com.zwy.pattern.tree.binarytree.treeEntity.Tree;


/**
 * 遍历策略
 * author:zwy
 * Date:2018/7/20
 * Time:16:40
 */
public interface IOrderStrategy {


    /**
     * 遍历策略
     * @param tree
     */
    void operate(Tree tree);

    /**
     * 遍历，且返回结果
     * @param tree
     * @return
     */
    Integer[] operateAndReturn(Tree tree);
}
