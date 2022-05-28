package com.itheima.fordemo;

/**
 *统计一百以内三的倍数个数
 */
public class ForDemo4 {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 0; i <= 100; i += 3) {
            sum += i;
        }
        System.out.println(sum);
    }
}
