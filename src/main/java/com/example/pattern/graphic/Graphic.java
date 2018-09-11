package com.example.pattern.graphic;

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

    //深度遍历
    public static void DFS(int[][] matrix,int x){

        int[] array = matrix[x];

        for (int i = 0; i < array.length; i++) {
            if(array[i]==1){
                System.out.println("访问:"+(i+1)+"点");
                for (int j = 0; j < matrix[i].length; j++) {
                    matrix[i][j] = 2;
                }
                DFS(matrix,i);
            }
        }

    }

    public static void main(String[] args) {
        DFS(matrix(),1);
    }

}
