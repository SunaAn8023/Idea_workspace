package com.example.pattern.tree.binarytree;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.LinkedList;
import java.util.Queue;

/**
 * author:zwy
 * Date:2018/7/20
 * Time:16:26
 * 树
 */
public class Tree {

    private Integer data;
    private Tree leftchild;
    private Tree rightchild;
    private boolean flag;

    private final static Logger logger = LoggerFactory.getLogger(Tree.class);

    public Integer getData() {
        return data;
    }

    public void setData(Integer data) {
        this.data = data;
    }

    public Tree getLeftchild() {
        return leftchild;
    }

    public void setLeftchild(Tree leftchild) {
        this.leftchild = leftchild;
    }

    public Tree getRightchild() {
        return rightchild;
    }

    public void setRightchild(Tree rightchild) {
        this.rightchild = rightchild;
    }

    public boolean isFlag() {
        return flag;
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }

    private Tree() {
    }


    /**
     * 顺序结构存储数据
     * 参考王道数据结构2019版 107页
     * @param array
     * @return
     */
    public static Tree initTree(int[] array){
        if(array.length==0){
            logger.info("数据为空");
            return null;
        }

        Queue<Tree> queue = new LinkedList<>();
        Tree root = new Tree();
        queue.offer(root);

        for (int i = 0; i < array.length; i++) {
            Tree node = queue.poll();

            node.setData(array[i]);
            node.setFlag(true);

            Tree leftChild = new Tree();
            Tree rightChild = new Tree();

            node.setLeftchild(leftChild);
            node.setRightchild(rightChild);

            queue.offer(leftChild);
            queue.offer(rightChild);

        }
        return root;
    }

    public static void main(String[] args) {
        Tree tree = new Tree();
        System.out.println(tree.getData());
    }
}
