package com.zwy.pattern.tree.binarytree.strategy.impl;

import com.zwy.pattern.tree.binarytree.treeEntity.Tree;
import com.zwy.pattern.tree.binarytree.strategy.IOrderStrategy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.LinkedList;
import java.util.Queue;

/**
 * author:zwy
 * Date:2018/7/24
 * Time:15:14
 * 层次遍历
 */
public class LayerOrderOrderStrategy implements IOrderStrategy {

    private final static Logger logger = LoggerFactory.getLogger(LayerOrderOrderStrategy.class);

    @Override
    public void operate(Tree tree) {

        Queue<Tree> queue = new LinkedList<>();

        Tree mark = Tree.initTree(new int[]{-1});

        queue.offer(mark);
        queue.offer(tree);

        int n = 0;

        while (queue.size()>0){
            Tree node = queue.poll();
            if(node==null||node.getData()==null||node.getData().equals(0)) {
                continue;
            }

            if(node.getData().equals(-1)){

                if(queue.size()==0)
                    return;

                n++;
                queue.offer(mark);
                continue;
            }

            logger.info("层次遍历,当前层数:"+n+",当前节点:"+node.getData());
            queue.offer(node.getLeftchild());
            queue.offer(node.getRightchild());
        }

    }
}
