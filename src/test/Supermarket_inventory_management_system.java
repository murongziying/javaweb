package test;

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
        List<Integer> number = new ArrayList<Integer>();        //创建商品编号的对象
        List<String> name = new ArrayList<String>();            //创建商品名称的对象
        List<Double> price = new ArrayList<Double>();           //创建商品单价的对象
        number.add(0, 9001);                      //为商品编号对象添加元素
        number.add(1, 9002);
        number.add(2, 9003);
        name.add(0, "香蕉");                      //为商品名称对象添加元素
        name.add(1, "苹果");
        name.add(2, "雪梨");
        price.add(0, 2.1);                       //为商品单价对象添加元素
        price.add(1, 5.4);
        price.add(2, 4.6);
        System.out.println("1.查看商品清单");                     //提示信息
        System.out.println("2.添加商品");
        System.out.println("3.修改商品");
        System.out.println("4.删除商品");
        System.out.println("5.退出系统");
        while (true) {          //利用循环，使得程序可以重复操作
            switch (choose()) {     //选择相应的序号，可以实现对应的功能
                case 1:
                    printGoods(number, name, price);            //查看商品信息
                    break;
                case 2:
                    addGoods(number, name, price);              //添加商品信息
                    break;
                case 3:
                    setGoods(number, name, price);              //修改商品信息
                    break;
                case 4:
                    removeGoods(number, name, price);           //删除商品信息
                    break;
                case 5:
                    System.out.println("退出系统！！！");          //退出程序
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
        System.out.println("====请输入需要添加的商品信息====");
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入商品编号：");
        int bh = sc.nextInt();             //获取需要商品编号
        number.add(number.size(), bh);     //在集合末尾添加商品编号

        System.out.println("请输入商品名称：");
        String mc = sc.next();           //获取商品名称
        name.add(name.size(), mc);       //在集合末尾添加商品名称

        System.out.println("请输入商品单价：");
        double dj = sc.nextDouble();      //获取商品单价
        price.add(price.size(), dj);      //在集合末尾添加商品单价
    }

    public static void setGoods(List<Integer> number, List<String> name, List<Double> price) {
        System.out.println("====开始修改商品信息====");
        System.out.println("请输入需要修改的商品编号：");
        Scanner sc = new Scanner(System.in);
        int gqbh = sc.nextInt();                //获取需要修改的商品编号
        int index = number.indexOf(gqbh);       //得到需要修改的商品编号的索引值，利用索引值对商品的编号，名称，单价进行修改

        System.out.println("请输入修改后的商品编号：");
        int number1 = sc.nextInt();
        number.set(index, number1);             //利用商品编号的索引值将原来的商品编号修改成新的商品编号

        System.out.println("请输入修改后的商品名称：");
        String name1 = sc.next();
        name.set(index, name1);                 //利用商品编号索引值将原来的商品名称修改成新的商品编号

        System.out.println("请输入修改后的商品单价：");
        Double price1 = sc.nextDouble();
        price.set(index, price1);               //利用商品编号索引值将原来的商品单价修改成新的商品单价
    }

    public static void removeGoods(List<Integer> number, List<String> name, List<Double> price) {
        System.out.println("====开始删除商品信息====");
        System.out.println("请输入需要删除的商品编号：");
        Scanner sc = new Scanner(System.in);
        int bh = sc.nextInt();                      //获取需要删除的商品编号
        int index = number.indexOf(bh);             //获取需要删除的商品编号索引值
        number.remove(index);
        name.remove(index);
        price.remove(index);
    }

    public static int choose() {
        System.out.println("====开始选择序号====");
        System.out.println("请输入序号：");
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        return i;
    }
}