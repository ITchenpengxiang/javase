package com.itheima.homework;

import java.util.Scanner;

public class HomeWork2 {
    /**
     * 需求:
     * 1.根据程序员的工龄(整数)给程序员涨工资(整数),程序员的工龄和基本工资通过键盘录入
     * 2.涨工资的条件如下：
     * [10-15)     +20000
     * [5-10)      +10000
     * [3~5)       +5000
     * [1~3)       +3000
     * 3.运行程序:
     * 请输入作为程序员的你的工作的工龄:10
     * 请输入作为程序员的你的基本工资为:60000
     * 程序运行后打印格式
     * "您目前工作了10年，基本工资为 60000元, 应涨工资 20000元,涨后工资 80000元"
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入基本工资：");
        int money = scanner.nextInt();
        System.out.println("请输入您的工龄：");
        int workYear = scanner.nextInt();
        if (workYear >= 1 && workYear < 3) {
            System.out.println("您目前工作了"+workYear+"年，基本工资为"+money+"应该涨工资3000元，涨后工资为"+(money+3000)+"元");
        }else if ((workYear >=3 && workYear < 5)){
            System.out.println("您目前工作了"+workYear+"年，基本工资为"+money+"应该涨工资5000元，涨后工资为"+(money+5000)+"元");
        }else if ((workYear >=5 && workYear < 10)){
            System.out.println("您目前工作了"+workYear+"年，基本工资为"+money+"应该涨工资10000元，涨后工资为"+(money+10000)+"元");
        }else if ((workYear >=10 && workYear < 15)){
            System.out.println("您目前工作了"+workYear+"年，基本工资为"+money+"应该涨工资20000元，涨后工资为"+(money+20000)+"元");
        }else {
            System.out.println("您输入的工龄不符合规范！");
        }
    }
}
