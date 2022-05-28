package com.itheima.method;

public class MethodDemo6 {
    /**
     * 卫函数
     */
    public static void main(String[] args) {
        int [] array = {10,20,30,40,50};
        int index = getIndex(array, 30);
        System.out.println(index);
    }

    private static int getIndex( int[] array,int number) {
        int falg = -1;
        for (int i = 0; i <array.length ; i++) {
            if (array[i] ==number) {
                falg = i;
            }
        }
        return falg;
    }
}
