package com.itheima.homework;

import java.util.Scanner;

public class HomeWork1 {
    /**
     * 需求:
     * 	让用户依次录入三个整数，求出三个数中的最大值，并打印到控制台。【使用if】
     *
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入第一个数");
        int numberOne = scanner.nextInt();
        System.out.println("请输入第二个数");
        int numberTwo = scanner.nextInt();
        System.out.println("请输入第三个数");
        int numberThree = scanner.nextInt();
        if (numberOne > numberTwo) {
            if (numberOne >numberThree) {
                System.out.println("最大值为："+numberOne);
            }else{
                System.out.println("最大值为："+numberThree);
            }
        }else {
            if (numberTwo >numberThree) {
                System.out.println("最大值是："+numberTwo);
            }else {
                System.out.println("最大值是："+numberThree);
            }
        }
    }
}
