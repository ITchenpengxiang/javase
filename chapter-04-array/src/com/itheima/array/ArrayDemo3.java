package com.itheima.array;

import java.util.Scanner;

public class ArrayDemo3 {
    /**
     * 数组的练习
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] array = new  int[3];
        for (int i = 0; i < array.length ; i++) {
            System.out.println("请输入第"+i+"个下表的元素:");
            array[i] = sc.nextInt();
        }
        for (int i = 0; i <array.length ; i++) {
            System.out.print(array[i]);
        }
    }
}
