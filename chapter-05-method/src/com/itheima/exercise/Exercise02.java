package com.itheima.exercise;

public class Exercise02 {
    public static void main(String[] args) {
        /**
         * 方法练习题2:定义一个方法,方法接收一个int数组,打印数组中最大值与最小值的差值.
         */
        int [] array = {2,34,77,19,79,88,17};
        getUnmber(array);
    }

        //求最大值和最小值得差值
    public static void getUnmber(int [] array) {
        int max = array[0];
        int min =array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
            if (array[i] <min) {
                min = array[i];
            }
        }
        System.out.println("最大值和最小值的差值为:"+(max -min));
    }
}