package com.zwy.pattern.tree.binarytree;

import com.zwy.pattern.tree.binarytree.BST.ISearchStrategy;
import com.zwy.pattern.tree.binarytree.BST.impl.SearchAntiRecursionStrategy;
import com.zwy.pattern.tree.binarytree.strategy.impl.*;
import com.zwy.pattern.tree.binarytree.treeEntity.Tree;
import com.zwy.pattern.tree.binarytree.strategy.*;

/**
 * author:zwy
 * Date:2018/7/24
 * Time:14:58
 */
public class Main {

    public static void main(String[] args) {
//        search();
        order();
    }

    /**
     * 二叉平衡树查找
     */
    private static void search(){

        Tree tree = Tree.initTree(new int[]{6,2,8,1,4,0,0,0,0,3,0},new String[]{"a","b","c","d","e","f","g","h","i","j","k"});

        ISearchStrategy searchAntiRecursionStrategy = new SearchAntiRecursionStrategy();
        IOrderStrategy orderStrategy = new LayerOrderOrderStrategy();

        Tree node = Tree.initTree(new int[]{7});

        //添加节点
        Tree tree1 = searchAntiRecursionStrategy.addNode(tree,node);
        orderStrategy.operate(tree1);

    }

    /**
     * 遍历
     */
    private static void order() {
        Tree tree = Tree.initTree(new int[]{1,2,3,0,4,0,5,0,0,6,0});

        //先序遍历
        IOrderStrategy preOrder = new PreOrderOrderStrategy();
        preOrder.operate(tree);

        //后序遍历
        IOrderStrategy postOrder = new PostOrderOrderStrategy();
        postOrder.operate(tree);

        //中序遍历
        IOrderStrategy midOrder = new MidOrderOrderStrategy();
        midOrder.operate(tree);

        //层次遍历
        IOrderStrategy layerOrder = new LayerOrderOrderStrategy();
        layerOrder.operate(tree);

        //先序非递归遍历
        IOrderStrategy preOrderAnti = new PreOrderAntiRecursionOrderStrategy();
        preOrderAnti.operate(tree);

        //中序非递归遍历
        IOrderStrategy midOrderAnti = new MidOrderAntiRecursionOrderStrategy();
        midOrderAnti.operate(tree);

        //后序非递归遍历
        IOrderStrategy postOrderAnti = new PostOrderAntiRecursionOrderStrategy();
        postOrderAnti.operate(tree);
    }
}
