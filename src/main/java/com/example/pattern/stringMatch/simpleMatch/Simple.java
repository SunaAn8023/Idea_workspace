package com.example.pattern.stringMatch.simpleMatch;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * author:zwy
 * Date:2018/7/21
 * Time:15:52
 * 简单字串匹配
 */
public class Simple {

    private final static Logger logger = LoggerFactory.getLogger(Simple.class);

    /**
     * 自定义简单字串匹配
     * @param str1 被匹配值
     * @param str2 匹配值
     * @return 匹配字段的开始值
     */
    public static int index(String str1,String str2){

        char[] a = str1.toCharArray();
        char[] b = str2.toCharArray();

        int i = 0;
        int j = 0;
        while (i<a.length&&j<b.length){

            if(a[i]==b[j]){
                i++;
                j++;
            }else {
                i = i-j+1;
                j = 0;
            }

        }

        if(i>a.length||j>b.length)
            return 0;
        else
            return i-j;
    }

    public static void main(String[] args) {

        int value = index("hello world","ld");
        logger.info(""+value);
    }
}
