package com.itheima.operator;

import org.junit.Test;

import java.util.Scanner;

public class OpertorDemo6 {
    /*
        短路逻辑与 和短路逻辑或    &&   ||
     */
    public static void main(String[] args) {
        int admin;
        int passWord;
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入账号：");
        admin = scanner.nextInt();
        System.out.println("请输入密码：");
        passWord = scanner.nextInt();
        if (admin == 123 && passWord == 456) {
            System.out.println("登录成功！");
        } else {
            System.out.println("登录失败！");
        }
    }
}
