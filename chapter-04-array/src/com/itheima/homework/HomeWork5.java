package com.itheima.homework;

public class HomeWork5 {
    /**
     * 现有一个整数数组{100,50,90,60,80,70}。
     * 请编写程序，计算去掉最大值和最小值后的平均值（不考虑小数部分）
     */
    public static void main(String[] args) {
        int[] array = {100, 50, 90, 60, 80, 70};

        //找出最大值和最小值
        int min = array[0];
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
            if (array[i] > max) {
                max = array[i];
            }
        }

        //求和
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }

        //求平均数
        int avg = (sum-max-min)/(array.length-2);
        System.out.println(avg);
    }
}
