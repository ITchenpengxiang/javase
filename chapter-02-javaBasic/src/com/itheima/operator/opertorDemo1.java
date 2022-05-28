package com.itheima.operator;

public class opertorDemo1 {
    public static void main(String[] args) {

        //强制类型转换
         int  a = 100;
         byte b = (byte) a;


        //自动类型转换
        int numberOne  = 1000;
        double numberTwo = numberOne;
        System.out.println(numberTwo);  //1000.0

        //强制类型转换
        double numberThree = 3.14159;
        int numbetFour = (int) numberThree;
        System.out.println(numbetFour);     //3

        //常量优化机制(将int类型的100赋值给byte类型)
        byte bb = 100;
        System.out.println(bb);

        char ca = (char) numbetFour;
        System.out.println(ca);
    }
}
