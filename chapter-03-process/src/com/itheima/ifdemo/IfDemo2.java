package com.itheima.ifdemo;

import java.util.Scanner;
/*
    判断两个数的最大值
 */
public class IfDemo2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入第一个数字a");
        double a = scanner.nextDouble();
        System.out.println("请输入第二个数字b");
        double b = scanner.nextDouble();
        if (a>b){
            System.out.println("a大于b");
        }else {
            System.out.println("b大于a");
        }
    }
}
