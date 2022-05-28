package com.itheima.fordemo;

/**
    for循环,求1到100的和
 */
public class ForDemo1 {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 0; i <= 100; i++) {
            sum += i;
        }
        System.out.println(sum);
    }
}
