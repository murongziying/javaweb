package test;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.lang.Integer;
import java.lang.Double;
import java.lang.String;

/*
 * 日期：2019/2/23
 * 作者：刘超
 * 功能：超市库存管理系统
 * */
public class Supermarket_inventory_management_system {
    public static void main(String[] args) {
        System.out.println("======欢迎光临慕容紫英便利超市======");
        List<Integer> number = new ArrayList<Integer>();
        List<String> name = new ArrayList<String>();
        List<Double> price = new ArrayList<Double>();
        number.add(0, 9001);
        number.add(1, 9002);
        number.add(2, 9003);
        name.add(0, "香蕉");
        name.add(1, "苹果");
        name.add(2, "雪梨");
        price.add(0, 2.1);
        price.add(1, 5.4);
        price.add(2, 4.6);
        System.out.println("1.查看商品清单");
        System.out.println("2.添加商品");
        System.out.println("3.修改商品");
        System.out.println("4.删除商品");
        System.out.println("5.退出系统");
        while (true) {
            switch (choose()) {
                case 1:
                    printGoods(number, name, price);
                    break;
                case 2:
                    addGoods(number, name, price);
                    break;
                case 3:
                    setGoods(number, name, price);
                    break;
                case 4:
                    removeGoods(number, name, price);
                    break;
                case 5:
                    System.out.println("退出系统！！！");
                    return;
                default:
                    System.out.println("没有这个功能");
                    break;
            }
        }
    }

    public static void printGoods(List<Integer> number, List<String> name, List<Double> price) {
        System.out.println("=======库存清单========");
        System.out.println("商品编号" + "    商品名称" + "    商品单价");

        //遍历所有商品信息
        for (int i = 0; i < number.size(); i++) {
            System.out.println(number.get(i) + "      " + name.get(i) + "        " + price.get(i));
        }
    }

    public static void addGoods(List<Integer> number, List<String> name, List<Double> price) {
        System.out.println("请输入需要添加的商品信息");
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入商品编号：");
        int bh = sc.nextInt();
        number.add(number.size(), bh);     //添加商品编号

        System.out.println("请输入商品名称：");
        String mc = sc.next();
        name.add(name.size(), mc);       //添加商品名称

        System.out.println("请输入商品单价：");
        double dj = sc.nextDouble();
        price.add(price.size(), dj);      //添加商品单价
    }

    public static void setGoods(List<Integer> number, List<String> name, List<Double> price) {
        System.out.println("请输入需要修改的商品编号：");
        Scanner sc = new Scanner(System.in);
        int gqbh = sc.nextInt();
        int index = number.indexOf(gqbh);
        System.out.println("请输入修改后的商品编号：");
        int number1 = sc.nextInt();
        number.set(index, number1);
        System.out.println("请输入修改后的商品名称：");
        String name1 = sc.next();
        name.set(index, name1);
        System.out.println("请输入修改后的商品单价：");
        Double price1 = sc.nextDouble();
        price.set(index, price1);
    }

    public static void removeGoods(List<Integer> number, List<String> name, List<Double> price) {
        System.out.println("请输入需要删除的商品编号：");
        Scanner sc = new Scanner(System.in);
        int bh = sc.nextInt();
        int index = number.indexOf(bh);
        number.remove(index);
        name.remove(index);
        price.remove(index);
    }

    public static int choose() {
        System.out.println("请输入序号：");
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        return i;
    }
}