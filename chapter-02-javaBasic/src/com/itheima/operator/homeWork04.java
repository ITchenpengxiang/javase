package com.itheima.operator;

import java.util.Scanner;

/*
    需求:
	一座寺庙里住着三个和尚，已知他们的身高分别为150cm、210cm、165cm，
	请用程序实现获取这三个和尚的最高身高。

一个题两个类(手动指定数据,键盘录入数据)
 */
public class homeWork04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入第一个和尚的身高");
        double h1 = scanner.nextDouble();
        System.out.println("请输入第二个和尚的身高");
        double h2 = scanner.nextDouble();
        System.out.println("请输入第三个和尚的身高");
        double h3 = scanner.nextDouble();

        double max = (h1 > h2 ? h1 : h2);
        System.out.println(max > h3 ? max : h3);
    }
}
