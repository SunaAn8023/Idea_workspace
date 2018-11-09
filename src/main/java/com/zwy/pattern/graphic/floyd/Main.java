package com.zwy.pattern.graphic.floyd;

/**
 * floyd算法
 * author:zwy
 * Date:2018/10/24
 * Time:20:48
 */
public class Main {

    private int[][] graphic;

    public Main(int[][] graphic){
        this.graphic = graphic;
        this.pathWeight = graphic;
        path = new int[graphic.length][graphic.length];
    }

    private int[][] pathWeight;

    private int[][] path;


    /**
     * 更新权重表和路径表
     * @param node
     */
    private void updatePathNode(int node){

        for (int i = 0; i < graphic.length; i++) {
            for (int j = 0; j < graphic.length; j++) {

                if (graphic[i][j]!=0){
//                    System.out.println("i:"+i+" j:"+j+" node:"+node);
//                    System.out.println("原:"+pathWeight[i][j]+" 现1:"+pathWeight[i][node]+" 现2:"+pathWeight[node][j]);
                    if (pathWeight[i][j]>(pathWeight[i][node]+pathWeight[node][j])){
                        pathWeight[i][j] = pathWeight[i][node]+pathWeight[node][j];
                        path[i][j] = node;

                    }

                }

            }
        }
    }

    /**
     * 更新表
     */
    private void updatePath(){

        for (int i = 0; i < graphic.length; i++) {
            updatePathNode(i);
        }
    }

    /**
     * 获得路径
     * @param node1 开始节点
     * @param node2 结束节点
     */
    private void getPath(int node1,int node2){
        System.out.println(node1);
        if(path[node1][node2]!=0){
            getPath(path[node1][node2],node2);
        }
    }

    private static void visitArray(int[][] array){
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j]+"\t");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {


        int[][] graphic = new int[][]{
                {0,5,8,8},
                {6,0,3,2},
                {3,3,0,2},
                {4,4,1,0}
        };

        Main main = new Main(graphic);

        main.updatePath();
        main.getPath(0,3);
    }


}
