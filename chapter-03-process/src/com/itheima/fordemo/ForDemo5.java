package com.itheima.fordemo;

/**
 * 打印所有水仙花数，并统计个数
 */
public class ForDemo5 {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 100; i <= 999; i++) {
            int bai = i / 100 % 10;
            int shi = i / 10 % 10;
            int ge = i % 10;
            if (bai * bai * bai + shi * shi * shi + ge * ge * ge == i) {
                System.out.println("数字" + i + "是水仙花数");
                sum += 1;
            }
        }
        System.out.println(sum);
    }
}
