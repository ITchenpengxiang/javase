package com.itheima.homework;

import java.util.Arrays;

public class HomeWork4 {
    /**
     * 生成一个方法,方法可以将一个指定int数组的内容扩容两倍,并返回结果.
     * 例:传入数组int[] arr(1,2,3,4,5) 返回数组int[] arr2(1,2,3,4,5,0,0,0,0,0);
     * 返回的数组要包含源数组内容.
     */
    public static void main(String[] args) {
        int [] array = {1,2,3,4,5};
        System.out.println(Arrays.toString(arrayCopy(array)));
    }
    //创建新数组并将原数组中的值复制过去
    public static int[] arrayCopy(int [] array) {
        int [] array1 = new int[(array.length)*2];
        for (int i = 0; i < array.length; i++) {
            array1[i] = array[i];
        }
        return array1;
    }
}
