package com.example;

//链表：单链表与双链表的构建与插入节点
public class LinkedList {
    private  int data;
    LinkedList nextNode;//下一个节点 （单链表只有nextNode）
    LinkedList lastNode;//上一个节点 （双链表连接上一个节点又连接下一个节点）

    public static void main(String[] args) {
        LinkedList first=new LinkedList();
        first.data=10;

        LinkedList second=new LinkedList();
        second.data=12;

        LinkedList third=new LinkedList();
        third.data=14;

        LinkedList four=new LinkedList();
        four.data=16;

        //five是要插入的新节点，插入的位置是在2的前面，在1和2的中间
        LinkedList five=new LinkedList();
        five.data=18;

        //构建链表-单链表构建
        first.nextNode=second;
        second.nextNode=third;
        third.nextNode=four;

        //新增five节点的代码
        first.nextNode=five;
        five.nextNode=second;

       //调用单链表遍历方法
        lianbiaobl(first);

    }
    public static void lianbiaobl(LinkedList node){
        if(node==null){
            return;
        }
        System.out.println(node.data);
        lianbiaobl(node.nextNode);

    }
}
