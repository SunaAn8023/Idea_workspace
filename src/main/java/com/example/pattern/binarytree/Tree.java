package com.example.pattern.binarytree;

/**
 * author:zwy
 * Date:2018/7/20
 * Time:16:26
 * 树
 */
public class Tree {

    private int data;
    private Tree leftchild;
    private Tree rightchild;

    public int getData() {
        return data;
    }

    public void setData(int data) {
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
}
