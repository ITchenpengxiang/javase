package com.itheima.array;

public class ArrayDemo5 {
    public static void main(String[] args) {
        int [] array = {21,88,90,43,1};
        int max = array[0];
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] >max) {
                max = array[i];
            }
            if (array [i] <min) {
                min =array[i];
            }
        }
        System.out.println(max);
        System.out.println(min);
    }
}
