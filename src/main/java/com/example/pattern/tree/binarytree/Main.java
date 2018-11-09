package com.example.pattern.tree.binarytree;

import com.example.pattern.tree.binarytree.treeEntity.Tree;
import com.example.pattern.tree.binarytree.strategy.*;
import com.example.pattern.tree.binarytree.strategy.impl.PostOrderAntiRecursionOrderStrategy;
import com.example.pattern.tree.binarytree.strategy.impl.PostOrderOrderStrategy;

/**
 * author:zwy
 * Date:2018/7/24
 * Time:14:58
 */
public class Main {

    public static void main(String[] args) {
        Tree tree = Tree.initTree(new int[]{1,2,3,0,4,0,5,0,0,6,0});

//        IOrderStrategy preOrder = new PreOrderOrderStrategy();
//        preOrder.operate(tree);
//
        IOrderStrategy postOrder = new PostOrderOrderStrategy();
        postOrder.operate(tree);
//
//        IOrderStrategy midOrder = new MidOrderOrderStrategy();
//        midOrder.operate(tree);

//        IOrderStrategy layerOrder = new LayerOrderOrderStrategy();
//        layerOrder.operate(tree);

//        IOrderStrategy preOrderAnti = new PreOrderAntiRecursionOrderStrategy();
//        preOrderAnti.operate(tree);

//        IOrderStrategy midOrderAnti = new MidOrderAntiRecursionOrderStrategy();
//        midOrderAnti.operate(tree);

        IOrderStrategy postOrderAnti = new PostOrderAntiRecursionOrderStrategy();
        postOrderAnti.operate(tree);
    }
}
