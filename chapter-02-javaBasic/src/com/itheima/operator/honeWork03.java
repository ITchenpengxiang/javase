package com.itheima.operator;

import java.util.Scanner;

public class honeWork03 {
    /*
        需求:
	动物园里有两只老虎，已知两只老虎的体重分别为180kg、200kg，
	请用程序实现判断两只老虎的体重是否相同。

一个题两个类(手动指定数据,键盘录入数据)
     */
    public static boolean sameWeight (){
        double tiger1Weight ;
        double tiger2Weight ;
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入第一只老虎的重量：");
        tiger1Weight = scanner.nextDouble();
        System.out.println("请输入第二只老虎的重量：");
        tiger2Weight = scanner.nextDouble();
        if (tiger1Weight == tiger2Weight) {
            return true;
        }else {
            return false;
        }
    }

    public static void main(String[] args) {
        System.out.println(sameWeight());
    }
}
