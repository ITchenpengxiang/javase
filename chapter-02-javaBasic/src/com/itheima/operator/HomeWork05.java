package com.itheima.operator;

public class HomeWork05 {
    /*
        和尚比较
     */
    public static void main(String[] args) {
        int monkOne = 165;
        int monkTwo = 210;
        int monkThree = 250;

        int temp = monkOne > monkTwo ? monkOne : monkTwo;
        int max = temp > monkThree ? temp : monkThree;
        System.out.println(max);
    }
}
