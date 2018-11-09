package com.zwy.pattern.graphic.strategy.impl;

import com.zwy.pattern.graphic.strategy.Strategy;

import java.util.ArrayList;
import java.util.List;

/**
 * 深度优先遍历
 * author:zwy
 * Date:2018/10/24
 * Time:14:01
 */
public class DFS implements Strategy {

    @Override
    public void operate(int[][] graphic) {

        visit(0,graphic);

        route.forEach(r->{
            System.out.println(r);
        });
    }

    public static void main(String[] args) {
        DFS dfs = new DFS();

        dfs.operate(new int[][]{
                {0,0,1,0},
                {0,0,1,0},
                {1,1,0,1},
                {0,0,1,0}
        });

    }

   private List<Integer> route = new ArrayList<>();

    private void visit(int currentNode,int[][] graphic){

        for (int i = 0; i < graphic.length; i++) {
            graphic[i][currentNode] = 0;
        }

        //访问当前节点
        route.add(currentNode);

        for (int i = 0; i < graphic.length; i++) {

            if(graphic[currentNode][i]!=0){
                visit(i,graphic);
            }

        }

    }

}
