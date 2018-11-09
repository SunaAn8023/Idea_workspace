package com.example.pattern.tree.binarytree.strategy.impl;

import com.example.pattern.tree.binarytree.treeEntity.Tree;
import com.example.pattern.tree.binarytree.strategy.IOrderStrategy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Stack;

/**
 * author:zwy
 * Date:2018/7/24
 * Time:16:32
 * 后序遍历非递归算法
 */
public class PostOrderAntiRecursionOrderStrategy implements IOrderStrategy {

    private final static Logger logger = LoggerFactory.getLogger(PostOrderAntiRecursionOrderStrategy.class);

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
}
