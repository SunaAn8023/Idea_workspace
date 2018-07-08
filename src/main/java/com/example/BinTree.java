package com.example;

import java.util.ArrayDeque;
import java.util.Queue;

//二叉树层次遍历
public class BinTree {

    private int data;
    private BinTree lchild;//左孩子
    private BinTree rchild;//右孩子

    private BinTree (int c) {
       data=c;
    }

    //层次遍历方法 一层一层遍历
    public static  void cenci(BinTree node){
        if (node==null){
            return;
        }
        Queue<BinTree> queue=new ArrayDeque<BinTree>();
        //offer&&poll优于add&&remove是因为它们的返回值可以判断成功与否，而不抛出异常

        //1.将根节点放入队列
        queue.offer(node);
        //2.若队列非空，将一个结点出队列，并访问该节点
        while(!queue.isEmpty()){
            node=queue.poll();
            System.out.println(node.data);

            //3.若该节点的左子树为非空，则将该节点的右孩子节点入队列
            if (node.lchild!=null){
                queue.offer(node.lchild);
            }
            //4.若该节点的右子树为非空，则将该节点的右孩子节点入队列
            if (node.rchild!=null){
                queue.offer(node.rchild);
            }
        }

    }

    //先序遍历 根，左，右 （一定要左节点遍历完再遍历右节点）
    public static void  pre(BinTree node){
        if (node==null){
            return;
        }
        System.out.println(node.data);
        pre(node.lchild);
        pre(node.rchild);
    }

    //中序遍历 左，根，右
    public  static  void  min(BinTree node){
        if (node==null){
            return;
        }
        min(node.lchild);
        System.out.println(node.data);
        min(node.rchild);
    }

    //后序遍历 左，右，根
    public  static  void  last(BinTree node){
        if (node==null){
            return;
        }
        last(node.lchild);
        last(node.rchild);
        System.out.println(node.data);
    }

    public static  void  main(String[] args){
        BinTree t1=new BinTree(12);
        BinTree t2=new BinTree(15);
        BinTree t3=new BinTree(8);
        BinTree t4=new BinTree(11);
        BinTree t5=new BinTree(15);
        BinTree t6=new BinTree(17);
        BinTree t7=new BinTree(19);

        //构成二叉树 t1\t2\t3
        t1.lchild=t2;
        t1.rchild=t3;

        t2.lchild=t4;
        t2.rchild=t5;

        t3.lchild=t6;
        t3.rchild=t7;

       //调用二叉树层次遍历方法
        BinTree.cenci(t1);
        //BinTree.pre(t1);
        //BinTree.min(t1);
        //BinTree.last(t1);
    }
}
