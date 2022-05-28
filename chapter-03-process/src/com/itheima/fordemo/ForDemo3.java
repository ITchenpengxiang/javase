package com.itheima.fordemo;

/**
 * 99乘法表
 */
public class ForDemo3 {
    public static void main(String[] args) {
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + "*" + i + "= " + (i * j) + "  ");
            }
            System.out.println();
        }
    }
}
