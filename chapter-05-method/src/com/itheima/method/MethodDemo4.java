package com.itheima.method;

public class MethodDemo4 {
    public static void main(String[] args) {
        //方法一调用不输出
        getQusrtSales(100,101.2,99.8);
        //方法二,直接输出
        System.out.println(getQusrtSales(100.0, 101.2, 99.8));
        //方法三,用变量接收,再输出
       double result= getQusrtSales(100,101.2,99.8);
        System.out.println(result);
    }

    private static double getQusrtSales(double month1Sales,double month2Sales,double month3Sales) {
        return month1Sales+month2Sales+month3Sales;
    }
}
