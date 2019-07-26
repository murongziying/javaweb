package String.org.linuxc.demo4;

import day01.Constant;

/*
 * 作者：刘超
 * 时间：2019.7.21
 * 功能：定义一个计算机
 * */
public class Computer {
    String brand;
    String color;
    String model;
    double memory;
    double harddisk;
    double price;

    public void open() {

    }

    public void close() {

    }

    public void run() {

    }
}


class Demo {
    public static void main(String[] args) {
        Computer c = new Computer();
        c.brand = "acer";
        c.color = "黑色";
        c.harddisk = 512;
        c.memory = 16;
        c.model = "aspire7";
        c.price = 5899;
        c.open();
        c.run();
        c.close();
    }
}