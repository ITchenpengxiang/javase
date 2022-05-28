package com.itheima.operator;

import org.junit.Test;

public class Test1 {
    @Test
    public void add(int a,int b){
        System.out.println(a+b);
    }

    public static void main(String[] args) {
        /**
         * 自动转到大的类型进行计算
         */
        int a =2;
        double b =10.0;
        System.out.println(a/b);
    }
}
