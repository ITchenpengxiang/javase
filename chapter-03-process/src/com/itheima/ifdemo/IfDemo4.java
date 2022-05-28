package com.itheima.ifdemo;

import java.util.Scanner;

public class IfDemo4 {
    /*
        减肥计划
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请您输入一个星期数：");
        int week = sc.nextInt();
            if (week == 1) {
                System.out.println("今天是周一");
            }else if (week == 2) {
                System.out.println("今天是周二");
            }else if (week == 3) {
                System.out.println("今天是周三");
            }else if (week == 4) {
                System.out.println("今天是周四");
            }else if (week == 5) {
                System.out.println("今天是周五");
            }else if (week == 6) {
                System.out.println("今天是周六");
            }else if (week == 7) {
                System.out.println("今天是周日");
            }else {
                System.out.println("您输入的有误");
            }

    }
}
