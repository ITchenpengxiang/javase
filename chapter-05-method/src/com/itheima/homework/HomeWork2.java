package com.itheima.homework;

public class HomeWork2 {
    /**
     * 定义一个方法，该方法能够找出三个整数中的最大值并返回。在主方法中调用方法测试执行。
     */
    public static void main(String[] args) {
        int numberOne = 33, numberTwo = 99, numberThree = 59;
        System.out.println(getMin(numberOne, numberTwo, numberThree));
    }

    //找三个数的最大值
    public static int getMin(int numberOne, int numbetrTwo, int numberThree) {
        //两个三元运算符
        int max = numberOne > numbetrTwo ? numberOne : numbetrTwo;
        return max > numberThree ? max : numberThree;
    }
}
