# Idea_workspace
环境:jdk1.8 maven3.5 
IDE:idea
日常java小作业

目前有 链表 二叉树 kmp算法 图 查找 排序

链表遍历等方法，目前写法仅为实现功能，参数不完美：处理方式在类中加linkedlist变量，或者改变结构体。

目录结构
    graphic
           >aov             待完成
           >dijkstra
           >floyd
           >strategy
                    >BFS    广度遍历
                    >DFS    深度遍历
    linkedlist
            >factory
                    >    >DoubleLinkedList      但链表
                                >(遍历)(初始化)(添加节点)(删除节点)
                    >    >SingleLinkedList      双链表    
                                >(遍历)(初始化)(添加节点)(删除节点)
    search
            >strategy
                    >BinarySearch       折半查找
                    >SequenceSearch     顺序查找
                    >BlockSearch        分块查找    待完成     
    sort
            >strategy
                    >BinaryInsertSort   折半插入排序
                    >DirectInsertSort   直接插入排序
                    >ShellSort          希尔排序    
                    >BubbleSort         冒泡排序
    stringMatch
             >kmp                       kmp算法
             >simpleMatch               简单匹配
    tree
            >binarytree
                    >BST                查找排序树
                    >huffman            霍夫曼树    待完成
                    >orderStrategy      排序策略
                    >threadThread       线索二叉树
                    
              
王道2019版 286页之前的暂未整理
          286页 shell算法 代码怪怪的，估计代码直接copy的片段，逻辑混乱
          285页 直接插入排序代码有误 第六行应更为 for(j=i-1;j>=0&&A[0].key<A[j].key;--j)
          