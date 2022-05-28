package com.itheima.operator;

import java.util.Scanner;

public class homeWork02 {
  /*  某外卖商家的菜品单价如下:
            1.鱼香肉丝每份24元,油炸花生米每份8元,米饭每份3元。
            2.优惠方式:
    总金额大于100元,总金额打9折,其它无折扣
    3.需求:
    小明购买了3分鱼香肉丝,3份花生米,5份米饭,最终需要付多少钱?

    一个题两个类(手动指定数据,键盘录入数据)*/
  public static void main(String[] args) {
      int fish = 24,peanut = 8,rise = 3;
      Scanner scanner = new Scanner(System.in);
      System.out.println("请输入购买鱼香肉丝的份数");
      int fishNumber = scanner.nextInt();
      System.out.println("请输入购买花生的份数");
      int peanutNumber = scanner.nextInt();
      System.out.println("请输入购买米饭的份数");
      int riseNumber = scanner.nextInt();

      int price = fish*fishNumber+peanut*peanutNumber+rise*riseNumber;
      if (price >100) {
          System.out.println(price*0.9);
      }
  }
}
