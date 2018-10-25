package com.example.pattern.tree.binarytree;

import com.example.pattern.tree.binarytree.strategy.*;

/**
 * author:zwy
 * Date:2018/7/24
 * Time:14:58
 */
public class Main {

    public static void main(String[] args) {
        Tree tree = Tree.initTree(new int[]{1,2,3,0,4,0,5,0,0,6,0});

//        IStrategy preOrder = new PreOrderStrategy();
//        preOrder.operate(tree);
//
        IStrategy postOrder = new PostOrderStrategy();
        postOrder.operate(tree);
//
//        IStrategy midOrder = new MidOrderStrategy();
//        midOrder.operate(tree);

//        IStrategy layerOrder = new LayerOrderStrategy();
//        layerOrder.operate(tree);

//        IStrategy preOrderAnti = new PreOrderAntiRecursionStrategy();
//        preOrderAnti.operate(tree);

//        IStrategy midOrderAnti = new MidOrderAntiRecursionStrategy();
//        midOrderAnti.operate(tree);

        IStrategy postOrderAnti = new PostOrderAntiRecursionStrategy();
        postOrderAnti.operate(tree);
    }
}
