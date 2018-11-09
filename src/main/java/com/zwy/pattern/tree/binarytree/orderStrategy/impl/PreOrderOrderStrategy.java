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
 * Time:11:12
 * 先序遍历
 */
public class PreOrderOrderStrategy implements IOrderStrategy {

    private final static Logger logger = LoggerFactory.getLogger(PreOrderOrderStrategy.class);

    private List<Integer> results = new ArrayList<>();

    @Override
    public void operate(Tree tree) {
        if(tree==null||tree.getData()==null||tree.getData()==0)
            return;
        logger.info("先序遍历递归算法，当前节点:"+tree.getData());
        operate(tree.getLeftchild());
        operate(tree.getRightchild());
    }

    private void ergodic(Tree tree){
        if(tree==null||tree.getData()==null||tree.getData()==0)
            return;
        results.add(tree.getData());
        ergodic(tree.getLeftchild());
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
