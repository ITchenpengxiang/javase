package com.itheima.array;
/**
 * 数组的练习
 */
public class ArrayDemo2 {
    public static void main(String[] args) {
        int [] array = new  int[10];
        for (int i = 0; i <array.length ; i++) {
            array[i] = i;
            System.out.print(array[i]);
        }
    }
}
