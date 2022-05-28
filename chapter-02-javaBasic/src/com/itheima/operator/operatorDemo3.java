package com.itheima.operator;

/*
    除法和取余
 */
public class operatorDemo3 {
    public static void main(String[] args) {
        int a = 10;
        int b = 3;
        double c = 3;
        System.out.println("10/3的的结果：" + a / b);        //小数直接砍掉
        System.out.println("10/3的的结果：" + a / c);        //不会砍掉

        System.out.println("7对2取余" + 7 % 2);
        System.out.println("17对2取余" + 7 % 2);
        System.out.println("27对2取余" + 7 % 2);


        System.out.println("16对2取余" + 16 % 2);
        System.out.println("26对2取余" + 26 % 2);

        System.out.println("负奇数对2取余" + (-7 % 2));
        System.out.println("付偶数对2取余" + (-8 % 2));
        int m ='我';
        System.out.println(m);
        int  mm = 97;
        char aa = 'a';
        System.out.println(mm==aa);
        System.out.println();

    }
}
