package com.zwy.pattern.tree.binarytree.BST;

import com.zwy.pattern.tree.binarytree.treeEntity.Tree;

/**
 * 排序树查找策略
 * author:zwy
 * Date:2018/11/9
 * Time:10:49
 */
public interface ISearchStrategy {

    /**
     * 查找节点
     * @param tree
     * @param data  key值
     * @return
     */
    Tree search(Tree tree,int data);

    /**
     * 添加节点
     * @param tree  树
     * @param node  节点
     */
    Tree addNode(Tree tree,Tree node);
}
