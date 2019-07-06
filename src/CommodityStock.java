/*
 * 作者：刘超
 * 日期：2018.7.14
 * 功能：显示商品库存
 * */

import java.util.Scanner;

public class CommodityStock {
    public static void main(String[] args) {
        String str1 = "MacBookAir   ";
        String str2 = "Thinkpad E470";
        String str3 = "acer Swift3  ";
        double size1 = 13.3;
        double size2 = 14.0;
        double size3 = 15.6;
        double size4 = 6098.00;
        double size5 = 4799.00;
        double size6 = 4999.00;
        int sto1 = 5;
        int sto2 = 10;
        int sto3 = 15;
        int sum = sto1 + sto2 + sto3;
        double money = size4 + size5 + size6;
        System.out.println("===========商品库存清单===============");
        System.out.println("品牌型号         尺寸    价格     库存数");
        System.out.println(str1 + "   " + size1 + "   " + size4 + "   " + sto1);
        System.out.println(str2 + "   " + size2 + "   " + size5 + "   " + sto2);
        System.out.println(str3 + "   " + size3 + "   " + size6 + "   " + sto3);
        System.out.println("====================================");
        System.out.println("剩余库存数为：" + sum);
        System.out.println("剩余库存的价值是：" + money);
    }
}

class stock {
    public static void main(String[] args) {
        String[] brand = {"Thinkpad E480", "Matebook 13", "acerSwift3"};
        int[] price = {4998, 5699, 4499};
        double[] size = {14.0, 13.0, 14.0};
        int[] count = {1, 2, 3,};
        while (true) {
            int choose = chooseFunction();
            switch (choose) {
                case 1:
                    printStore(brand, price, size, count);
                    break;
                case 2:
                    updateStore(brand, count);
                    break;
                case 3:
                    return;
                default:
                    System.out.println("没有这个功能！！！");
                    break;
            }
        }
    }

    public static void printStore(String[] brand, int[] price, double[] size, int[] count) {
        System.out.println("==========商品库存信息==========");
        System.out.println("型号          价格          尺寸          库存数");
        int totalMoney = 0;
        int totalCount = 0;
        for (int i = 0; i < brand.length; i++) {
            System.out.println(brand[i] + "     " + price[i] + "     " + size[i] + "     " + count[i]);
            totalMoney += price[i] * count[i];
            totalCount += count[i];
        }
        System.out.println("总金额是：" + totalMoney);
        System.out.println("总库存数：" + totalCount);
    }

    public static void updateStore(String[] brand, int[] count) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < brand.length; i++) {
            System.out.println("请输入" + brand[i] + "新的库存数量");
            int newCount = sc.nextInt();
            count[i] = newCount;
        }
    }

    public static int chooseFunction() {
        System.out.println("1、查看商品库存信息");
        System.out.println("2、修改商品库存信息");
        System.out.println("3、退出");
        System.out.println("请输入序号：");
        Scanner sc = new Scanner(System.in);
        int choose = sc.nextInt();
        return choose;
    }
}
