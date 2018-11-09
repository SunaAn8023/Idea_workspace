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
 * Time:11:21
 * 后序遍历
 *
 */
public class PostOrderOrderStrategy implements IOrderStrategy {

    private final static Logger logger = LoggerFactory.getLogger(PostOrderOrderStrategy.class);

    private List<Integer> results = new ArrayList<>();

    @Override
    public void operate(Tree tree) {
        if (tree==null||tree.getData()==null||tree.getData()==0)
            return;
        operate(tree.getLeftchild());
        operate(tree.getRightchild());
        logger.info("后序遍历递归算法，当前节点:"+tree.getData());
    }

    private void ergodic(Tree tree){
        if (tree==null||tree.getData()==null||tree.getData()==0)
            return;
        ergodic(tree.getLeftchild());
        ergodic(tree.getRightchild());
        results.add(tree.getData());
    }

    @Override
    public Integer[] operateAndReturn(Tree tree) {
        ergodic(tree);
        Integer[] array = new Integer[results.size()];
        results.toArray(array);
        return array;
    }
}
