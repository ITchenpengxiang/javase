package com.itheima.input;

import java.util.Scanner;
/*
    键盘输入
 */
public class InputDemo1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = 1, b = 2;
        int c = a + b > 3 ? ++a : b++;
        System.out.println(c);
    }
}
