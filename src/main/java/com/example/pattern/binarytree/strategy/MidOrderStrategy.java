package com.example.pattern.binarytree.strategy;

import com.example.pattern.binarytree.Tree;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * author:zwy
 * Date:2018/7/24
 * Time:11:19
 * 中序遍历
 */
public class MidOrderStrategy implements IStrategy{

    private static final Logger logger = LoggerFactory.getLogger(MidOrderStrategy.class);

    @Override
    public void operate(Tree tree) {
        if (tree==null||tree.getData()==null||tree.getData()==0)
            return;

        operate(tree.getLeftchild());
        logger.info("中序遍历递归算法，当前节点:"+tree.getData());
        operate(tree.getRightchild());

    }
}
