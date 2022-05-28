package com.itheima.homework;

public class HomeWork1 {
    /**
     * 需求:
     * 	请使用静态初始化的方式,创建一个长度为5的整数数组,并为数组中的元素赋值,
     * 	遍历数组,在同一行打印所有元素,元素之间用空格隔开,
     * 	比如:如果数组为{1,2,3,4,5}打印结果:1 2 3 4 5
     * 	System.out.println(内容); 打印后并换行.
     * System.out.print(内容); 打印不换行.
     */
    public static void main(String[] args) {
        int [] array = {1,2,3,4,5};
        for (int i : array) {
            System.out.print(i+" ");
        }
    }
}
