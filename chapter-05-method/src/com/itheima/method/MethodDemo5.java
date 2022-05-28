package com.itheima.method;

public class MethodDemo5 {
    /**
     * 方法的调用
     */
    public static void main(String[] args) {
        double rectangle1Length = 10.4, rectang1Width = 20.3, rectang2e1Length = 15.3, rectang2Width = 14.6;

        //获得面积
       double one= getRectangArea(rectangle1Length,rectang1Width);
        double two = getRectangArea(rectang2e1Length,rectang2Width);
        
        //求最大值
        System.out.println(getAreaMAx(one, two));
    }
    //最大值
    private static double getAreaMAx(double one,double two) {
        return one>two?one:two;
    }

    //面积
    private static double getRectangArea(double rectangleLength ,double rectangWidth) {
        return rectangleLength*rectangWidth; 
    }
}
