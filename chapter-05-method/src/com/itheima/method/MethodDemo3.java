package com.itheima.method;

public class MethodDemo3 {
    /**
     * 方法的实际参数和形式参数
     */
    public static void main(String[] args) {

        //1.求最大值的方法
        getMax(10,99);
        //2.打印数组长度的长度
        getArrayLength(new int[9]);
        //3.求长方形周长的方法
        getPerimeter(10,10);
        //4.求圆面积的方法
        getArea(2);
    }
    //打印圆的面积
    private static void getArea(int r) {
        System.out.println(r*r*3.14);
    }
    //打印长方形周长
    private static void getPerimeter(double length ,double width) {
        System.out.println(2*(length+width));
    }
    //打印数组的长度
    private static void getArrayLength(int[] array) {
        System.out.println(array.length);
    }
    //获取最大值
    private static void getMax(int unmberOne,int unmberTwo) {
        System.out.println(unmberOne>unmberTwo?unmberOne:unmberTwo);
    }
}
