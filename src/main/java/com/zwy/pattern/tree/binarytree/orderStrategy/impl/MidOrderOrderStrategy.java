package com.zwy.pattern.tree.binarytree.orderStrategy.impl;

import com.zwy.pattern.tree.binarytree.treeEntity.Tree;
import com.zwy.pattern.tree.binarytree.orderStrategy.IOrderStrategy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;

/**
 * author:zwy
 * Date:2018/7/24
 * Time:11:19
 * 中序遍历
 */
public class MidOrderOrderStrategy implements IOrderStrategy {

    private static final Logger logger = LoggerFactory.getLogger(MidOrderOrderStrategy.class);

    private List<Integer> results = new ArrayList<>();

    @Override
    public void operate(Tree tree) {
        if (tree==null||tree.getData()==null||tree.getData()==0)
            return;
        operate(tree.getLeftchild());
        logger.info("中序遍历递归算法，当前节点:"+tree.getData());
        operate(tree.getRightchild());
    }

    private void ergodic(Tree tree){
        if (tree==null||tree.getData()==null||tree.getData()==0)
            return;
        ergodic(tree.getLeftchild());
        results.add(tree.getData());
        ergodic(tree.getRightchild());
    }

    @Override
    public Integer[] operateAndReturn(Tree tree) {
        ergodic(tree);
        Integer[] array = new Integer[results.size()];
        results.toArray(array);
        return array;
    }
}
