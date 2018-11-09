package com.example.pattern.tree.binarytree.strategy;

import com.example.pattern.tree.binarytree.treeEntity.Tree;

/**
 * 遍历策略
 * author:zwy
 * Date:2018/7/20
 * Time:16:40
 */
public interface IOrderStrategy {

    void operate(Tree tree);
}
