package com.itheima.homework;

public class HomeWork1 {
    /**
     * 定义一个方法，该方法能够找出两个小数中的较小值并返回。在主方法中调用方法进行测试。
     */
    public static void main(String[] args) {
        int numberOne = 33,numberTwo = 99;
        System.out.println(getMin(numberOne, numberTwo));
    }

    //求最小值
    public static int getMin(int numberOne, int numbetrTwo) {

        return numberOne > numbetrTwo ? numbetrTwo : numberOne;
    }
}
