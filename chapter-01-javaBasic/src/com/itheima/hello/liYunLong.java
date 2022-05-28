package com.itheima.hello;

public class liYunLong {
    private String name = "李云龙";
    private  double  hight = 1.78;
    private  double weight = 74;
    private  String marry = "已婚";

    public liYunLong() {
    }

    public liYunLong(String name, double hight, double weight,String marry) {
        this.name = name;
        this.hight = hight;
        this.weight = weight;
        this.marry = marry;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getHight() {
        return hight;
    }

    public void setHight(double hight) {
        this.hight = hight;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getMarry() {
        return marry;
    }

    public void setMarry(String marry) {
        this.marry = marry;
    }
}
