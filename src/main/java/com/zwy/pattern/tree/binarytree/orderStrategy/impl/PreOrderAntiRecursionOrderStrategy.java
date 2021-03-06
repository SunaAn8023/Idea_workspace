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
 * Time:15:48
 * 先序遍历非递归算法
 */
public class PreOrderAntiRecursionOrderStrategy implements IOrderStrategy {

    private final static Logger logger = LoggerFactory.getLogger(PreOrderAntiRecursionOrderStrategy.class);

    private List<Integer> results = new ArrayList<>();

    @Override
    public void operate(Tree tree) {
        Stack<Tree> stack = new Stack<>();
        stack.push(tree);
        while (stack.size()>0){
            Tree node = stack.pop();
            if(node==null||node.getData()==null||node.getData().equals(0))
                continue;
            logger.info("非递归先序遍历，当前节点:"+node.getData());
            if(node.getRightchild()!=null&&node.getRightchild().getData()!=null&&!node.getRightchild().getData().equals(0)){
                stack.push(node.getRightchild());
            }
            if(node.getLeftchild()!=null&&node.getLeftchild().getData()!=null&&!node.getLeftchild().getData().equals(0)){
                stack.push(node.getLeftchild());
            }
        }
    }

    private void ergodic(Tree tree){
        Stack<Tree> stack = new Stack<>();
        stack.push(tree);
        while (stack.size()>0){
            Tree node = stack.pop();
            if(node==null||node.getData()==null||node.getData().equals(0))
                continue;
            results.add(tree.getData());
            if(node.getRightchild()!=null&&node.getRightchild().getData()!=null&&!node.getRightchild().getData().equals(0)){
                stack.push(node.getRightchild());
            }
            if(node.getLeftchild()!=null&&node.getLeftchild().getData()!=null&&!node.getLeftchild().getData().equals(0)){
                stack.push(node.getLeftchild());
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
