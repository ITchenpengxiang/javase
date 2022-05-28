package com.itheima.exercise;

public class Exercise01 {
    public static void main(String[] args) {
        /**
         * 方法练习题1:定义一个方法,方法接收一个int数组,遍历打印数组中所有大于20的元素.
         */
        int [] array = {2,34,77,19,79,88,17};
        printNumber(array);
    }

    public static void printNumber(int[] array) {
        for (int i : array) {
            if (i >20) {
                System.out.println(i);
            }
        }
    }
}
