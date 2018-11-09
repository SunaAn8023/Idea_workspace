package com.zwy.pattern.graphic.strategy.impl;

import com.zwy.pattern.graphic.strategy.Strategy;

import java.util.ArrayList;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;

/**
 * 广度遍历
 * author:zwy
 * Date:2018/10/24
 * Time:14:49
 */
public class BFS implements Strategy {

    public static void main(String[] args) {
        BFS bfs = new BFS();
        bfs.operate(new int[][]{
                {0,1,1,0,1,0},
                {1,0,0,0,0,0},
                {1,0,0,1,0,0},
                {0,0,1,0,1,0},
                {1,0,0,0,0,1},
                {0,0,0,0,1,0}
        });
    }

    @Override
    public void operate(int[][] graphic) {

        visit(graphic);

        route.forEach(r->{
            System.out.println(r);
        });


    }

    private List<Integer> route = new ArrayList<>();

    private Queue<Integer> queue = new LinkedBlockingQueue<>();

    private void visit(int[][] graphic){

        queue.add(0);

        while (queue.size()>0){

            int currentNode = queue.poll();
            route.add(currentNode);
            for (int i = 0; i < graphic.length; i++) {
                graphic[i][currentNode] = 0;
            }


            for (int i = 0; i < graphic.length; i++) {
                if(graphic[currentNode][i]!=0){
                    queue.add(i);
                }
            }


        }
    }

}
