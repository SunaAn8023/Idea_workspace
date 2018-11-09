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
 * Time:16:32
 * 后序遍历非递归算法
 */
public class PostOrderAntiRecursionOrderStrategy implements IOrderStrategy {

    private final static Logger logger = LoggerFactory.getLogger(PostOrderAntiRecursionOrderStrategy.class);

    private List<Integer> results = new ArrayList<>();

    @Override
    public void operate(Tree tree) {
        Stack<Tree> stack = new Stack<>();
        while(stack.size()>0||(tree!=null&&tree.getData()!=null&&!tree.getData().equals(0))){
            while(tree!=null&&tree.getData()!=null&&!tree.getData().equals(0)){
                stack.push(tree);
                tree = tree.getLeftchild();
            }
            tree = stack.pop();
            //第一次访问
            if(tree.isFlag()){
                tree.setFlag(false);
                stack.push(tree);
                tree = tree.getRightchild();
            }else {
                logger.info("非递归后序遍历算法，当前节点:"+tree.getData());
                tree = null;
            }
        }
    }

    private void ergodic(Tree tree){
        Stack<Tree> stack = new Stack<>();
        while(stack.size()>0||(tree!=null&&tree.getData()!=null&&!tree.getData().equals(0))){
            while(tree!=null&&tree.getData()!=null&&!tree.getData().equals(0)){
                stack.push(tree);
                tree = tree.getLeftchild();
            }
            tree = stack.pop();
            //第一次访问
            if(tree.isFlag()){
                tree.setFlag(false);
                stack.push(tree);
                tree = tree.getRightchild();
            }else {
                results.add(tree.getData());
                tree = null;
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
