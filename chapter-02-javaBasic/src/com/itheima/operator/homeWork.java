package com.itheima.operator;

import java.util.Scanner;

/*需求:
        身高是具有遗传性的，子女的身高和父母的身高有一定的关系。假定，父母和子女的身高遗传关系如下：
        儿子身高（厘米）＝(父亲身高＋母亲身高) ×1.08÷2
        女儿身高（厘米）＝(父亲身高×0.923＋母亲身高) ÷2
        现有父亲身高177CM,母亲身高165CM。求子女身高分别预计为多少？

        手动指定数据之后,再改成键盘录入.

        一个题两个类(手动指定数据,键盘录入数据)*/
public class homeWork {
    public static void main(String[] args) {
        double fatherHeight ;
        double motherHeight ;
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入父亲的身高：");
        fatherHeight = scanner.nextDouble();
        System.out.println("请输入母亲的身高");
        motherHeight = scanner.nextDouble();
        double sonHeight = ((fatherHeight+motherHeight)*1.08)/2;
        double daughterHeight = ((fatherHeight*0.923+motherHeight))/2;
        System.out.println("儿子身高"+sonHeight);
        System.out.println("女儿身高"+daughterHeight);
    }
}
