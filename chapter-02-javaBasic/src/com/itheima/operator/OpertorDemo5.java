package com.itheima.operator;

public class OpertorDemo5 {
    /*
        登录判断
     */
    public static void main(String[] args) {
        int a = 30;
        int b = 15;
        int c = 25;
        //第一个
        if (a % 3 == 0 && a < 50) {
            System.out.println(true);
        }else {
            System.out.println(false);
        }
        //第二个
        if (b % 3 == 0 && b > 20) {
            System.out.println(true);
        }else {
            System.out.println(false);
        }
        //第三个
        if (c % 4 == 0 || c < 30) {
            System.out.println(true);
        }else {
            System.out.println(false);
        }
    }
}
