package com.zwy.pattern.tree.binarytree.orderStrategy.impl;

import com.zwy.pattern.tree.binarytree.treeEntity.Tree;
import com.zwy.pattern.tree.binarytree.orderStrategy.IOrderStrategy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * author:zwy
 * Date:2018/7/24
 * Time:16:06
 * 非递归中序遍历
 */
public class MidOrderAntiRecursionOrderStrategy implements IOrderStrategy {

    private final static Logger logger = LoggerFactory.getLogger(MidOrderAntiRecursionOrderStrategy.class);

    private List<Integer> results = new ArrayList<>();

    @Override
    public void operate(Tree tree) {
        Stack<Tree> stack = new Stack<>();
        while (stack.size()>0||(tree!=null&&tree.getData()!=null&&!tree.getData().equals(0))){
            if(tree!=null&&tree.getData()!=null&&!tree.getData().equals(0)){
                stack.push(tree);
                tree = tree.getLeftchild();
            }else {
                tree = stack.pop();
                logger.info("非递归中序遍历,当前节点:"+tree.getData());
                tree = tree.getRightchild();
            }
        }
    }

    private void ergodic(Tree tree){
        Stack<Tree> stack = new Stack<>();
        while (stack.size()>0||(tree!=null&&tree.getData()!=null&&!tree.getData().equals(0))){
            if(tree!=null&&tree.getData()!=null&&!tree.getData().equals(0)){
                stack.push(tree);
                tree = tree.getLeftchild();
            }else {
                tree = stack.pop();
                results.add(tree.getData());
                tree = tree.getRightchild();
            }
        }
    }

    @Override
    public Integer[] operateAndReturn(Tree tree) {
        ergodic(tree);
        Integer[] array = new Integer[results.size()];
        results.toArray(array);
        return array;
    }
}
