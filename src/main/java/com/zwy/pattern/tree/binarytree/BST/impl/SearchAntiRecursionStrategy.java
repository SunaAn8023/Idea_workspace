package com.zwy.pattern.tree.binarytree.BST.impl;

import com.zwy.pattern.tree.binarytree.BST.ISearchStrategy;
import com.zwy.pattern.tree.binarytree.treeEntity.Tree;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 非递归查找
 * author:zwy
 * Date:2018/11/9
 * Time:10:56
 */
public class SearchAntiRecursionStrategy implements ISearchStrategy {

    private final static Logger log = LoggerFactory.getLogger(SearchAntiRecursionStrategy.class);

    @Override
    public Tree search(Tree tree, int data) {

        while (null!=tree&&null!=tree.getData()&&!tree.getData().equals(0)){

            if (tree.getData().equals(data)){
                log.info("查找成功:"+tree.getOtherData());
                return tree;
            }

            if (tree.getData()>data){
                tree = tree.getLeftchild();
                continue;
            }

            if (tree.getData()<data){
                tree = tree.getRightchild();
                continue;
            }

        }

        log.info("查找失败");
        return null;
    }

    @Override
    public Tree addNode(Tree tree, Tree node) {

        Tree tree1 = tree;
        while (null!=tree&&null!=tree.getData()&&!tree.getData().equals(0)){

            if (tree.getData().equals(node.getData())){
                log.info("节点已存在");
                return tree1;
            }

            if(tree.getData()<node.getData()){
                log.info("向右:"+tree.getData());
                tree = tree.getRightchild();
                continue;
            }

            if (tree.getData()>node.getData()){
                log.info("向左:"+tree.getData());
                tree = tree.getLeftchild();
                continue;
            }
        }
        tree.setData(node.getData());
        tree.setOtherData(node.getOtherData());
        tree.setFlag(node.isFlag());
        tree.setLeftchild(node.getLeftchild());
        tree.setRightchild(node.getRightchild());
        return tree1;
    }
}
