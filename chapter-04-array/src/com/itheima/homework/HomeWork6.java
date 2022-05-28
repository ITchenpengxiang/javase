package com.itheima.homework;

public class HomeWork6 {
    /**
     * 通过键盘输入数字创建一个指定长度的数组,并且通过键盘输入给数组中的每一个元素赋值,赋值完成后打印数组中的每一个元素.
     */
    public static void main(String[] args) {
        java.util.Scanner  sc = new java.util.Scanner (System.in);
        int [] array = new int[3];
        for (int i = 0; i < array.length; i++) {
            System.out.println("请输入第"+i+"个元素的值:");
            array[i] = sc.nextInt();
        }
        for (int i : array) {
            System.out.print(i+" ");
        }
    }
}
