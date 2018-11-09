package com.zwy.pattern.graphic.graphicEntity;

/**
 * author:zwy
 * Date:2018/9/11
 * Time:15:35
 */
public class Graphic {

    //邻接矩阵法
    public static int[][] matrix(){

        //王道2019 图5-19
        int array[][] = new int[][]{
                {0,1,1,1,0},
                {1,0,1,1,1},
                {1,1,0,1,0},
                {1,1,1,0,1},
                {0,1,0,1,0}
        };

        return array;
    }


}
