package com.example.pattern.graphic.dijkstra;


import java.util.ArrayList;
import java.util.List;

/**
 * Dijkstra算法
 * 图使用邻接矩阵法，值表示权重
 * author:zwy
 * Date:2018/10/24
 * Time:13:50
 */
public class Main {


    int[][] graphic = new int[][]{
            {0,10,0,0,5},
            {0,0,1,0,2},
            {0,0,0,4,0},
            {7,0,6,0,0},
            {0,3,9,2,0}
    };

    List<Integer> route = new ArrayList<>();

    public void dijkstra(){
        for (int i = 0; i < graphic.length; i++) {
            addRoute();
        }

        route.forEach(r->{
            System.out.println(r);
        });
    }



    /**
     * 添加注册节点
     */
    private void addRoute(){

        int minDistance = 0;
        int temp = 0;
        List<Integer> notVisit = notVisit(route);

        for (int i = 0; i < notVisit.size(); i++) {

            if (minDistance(notVisit.get(i),route)!=0){
                if(minDistance==0||minDistance>minDistance(notVisit.get(i),route)){
                    minDistance = minDistance(notVisit.get(i),route);
                    temp = notVisit.get(i);
                }

            }
        }
        route.add(temp);
    }


    public static void main(String[] args) {
        Main main = new Main();
        main.dijkstra();
//        int node = 1;
//        List<Integer> route = new ArrayList<>();
//        route.add(0);
//        route.add(4);
//        route.add(3);
//        System.out.println(main.minDistance(node,route));

    }

    /**
     * 获得最小距离
     * @param node  当前节点
     * @param route     已注册的路径
     * @return
     */
    private int minDistance(int node,List<Integer> route){

        int minDistance = 0;

        for (int i = 0; i < route.size(); i++) {

            int distance = distanceNode(node,route,i);
            if(minDistance==0||minDistance>distance&&distance!=0) {
                minDistance = distance;
            }
        }
        return minDistance;
    }

    /**
     * 获得未访问的节点
     * @param route
     * @return
     */
    private List<Integer> notVisit(List<Integer> route){

        List<Integer> allNode = new ArrayList<>();
        for (int i = 0; i < graphic.length; i++) {
            allNode.add(i);
        }
        allNode.removeAll(route);
        return allNode;
    }


    /**
     * 获得节点到这个路径的距离
     * @param node  当前节点
     * @param route 已经注册的路径
     * @param i 注册的路径的i个节点
     * @return
     */
    private int distanceNode(int node,List<Integer> route,int i){
        int distance = 0;
        if(i==0){
            return graphic[route.get(i)][node];
        }

        if(graphic[route.get(i)][node]!=0){
            for (int j = 0; j < i; j++) {
                distance = distance+graphic[route.get(j)][route.get(j+1)];
            }
            return distance + graphic[route.get(i)][node];
        }
        return 0;
    }




}
