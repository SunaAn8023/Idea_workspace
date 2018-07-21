package com.example.pattern.stringMatch.kmp;

/**
 * author:zwy
 * Date:2018/7/21
 * Time:16:12
 * kmp算法
 */
public class Kmp {

    /**
     * 用于存放k
     * @param p 被匹配字串
     * @return  k数组
     */
    public static int[] next(String p){
        char[] b = p.toCharArray();
        int[] next = new int[b.length];

        next[0] = -1;
        int k = -1;
        int i = 0;
        while (i<b.length-1){
            if(k==-1||b[i]==b[k]){
                next[++i] = ++k;
            }else{
                k = next[k];
            }
        }

        return next;
    }

    /**
     * kmp匹配
     * @param str1  被匹配字串
     * @param str2  匹配字串
     * @return
     */
    public static int index(String str1,String str2){

        char[] a = str1.toCharArray();
        char[] b = str2.toCharArray();
        int[] ks = next(str2);

        int i = 0;
        int j = 0;

        while (i<a.length&&j<b.length){
            if(a[i]==b[j]){
                i++;
                j++;
            }else {
                if(ks[j]==-1){
                    i++;
                }else{
                    j = ks[j];
                }
            }
        }

        if(i>a.length||j>b.length)
            return 0;
        else
            return i-j;

    }



    public static void main(String[] args) {
        int get = index("abcdef","cde");
        System.out.println(get);
    }
}
