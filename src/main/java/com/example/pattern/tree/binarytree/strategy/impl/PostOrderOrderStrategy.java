package com.example.pattern.tree.binarytree.strategy.impl;

import com.example.pattern.tree.binarytree.treeEntity.Tree;
import com.example.pattern.tree.binarytree.strategy.IOrderStrategy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * author:zwy
 * Date:2018/7/24
 * Time:11:21
 * 后序遍历
 *
 */
public class PostOrderOrderStrategy implements IOrderStrategy {

    private final static Logger logger = LoggerFactory.getLogger(PostOrderOrderStrategy.class);

    @Override
    public void operate(Tree tree) {

        if (tree==null||tree.getData()==null||tree.getData()==0)
            return;
        operate(tree.getLeftchild());
        operate(tree.getRightchild());
        logger.info("后序遍历递归算法，当前节点:"+tree.getData());

    }
}
