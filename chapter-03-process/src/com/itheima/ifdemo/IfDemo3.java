package com.itheima.ifdemo;

import java.util.Scanner;

public class IfDemo3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入第一个数字a");
        double a = scanner.nextDouble();
        System.out.println("请输入第二个数字b");
        double b = scanner.nextDouble();
        System.out.println("请输入第三个数字c");
        double c = scanner.nextDouble();

        if (a > b) {
            if (a > c) {
                System.out.println("最大值为a");
            } else {
                System.out.println("最大值为c");
            }
        } else {
            if (b > c) {
                System.out.println("b为最大值");
            } else {
                System.out.println("c为最大值");
            }
        }
    }
}
