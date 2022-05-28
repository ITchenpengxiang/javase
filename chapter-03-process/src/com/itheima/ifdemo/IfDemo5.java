package com.itheima.ifdemo;

import java.util.Scanner;

public class IfDemo5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入分数");
        Double sore = sc.nextDouble();

        if (sore >= 95 && sore <= 100) {
            System.out.println("要啥自行车：");
        } else if (sore >= 90 && sore<=94){
            System.out.println("去啥游乐园：");
        }else if (sore >= 80 && sore<=89) {
            System.out.println("要啥乐高");
        }else if (sore >= 0 && sore<=79) {
            System.out.println("出去挣钱吧，别上了");
        }else if (sore <0 ||sore>100) {
            System.out.println("您输入的数据有误");
        }
    }
}
