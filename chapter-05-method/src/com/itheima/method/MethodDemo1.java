package com.itheima.method;

public class MethodDemo1 {
    /**
     * 方法
     */
    public static void main(String[] args) {
         getMax(10, 20);
    }

    //求最大值
    public static void getMax(int numberOne, int numberTwo) {
        int max= numberOne > numberTwo ? numberOne : numberTwo;
        System.out.println(max);
    }

}
