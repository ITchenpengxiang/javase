package com.itheima.homework;

public class HomeWork {
    /**
     * 需求:
     * 从键盘上录入一个大于100的三位数,打印出100到该数字之间满足如下要求的数字,数字的个数,以及数字的和:
     * 1.数字的个位数不为7;
     * 2.数字的十位数不为5;
     * 3.数字的百位数不为3;
     */
    public static void main(String[] args) {
        int sum = 0;    //求和
        int count = 0;  //统计个数
        for (int i = 100; i < 1000; i++) {
            int bai = i / 100 % 10;
            int shi = i / 10 % 10;
            int ge = i % 10;
            if (bai != 3 && shi != 5 && ge != 7) {
                count++;
                sum+=i;
            }
        }
        System.out.println("和为"+sum);
        System.out.println("个数"+count);
    }
}
