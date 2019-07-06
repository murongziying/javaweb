package day02;

/*
 * author：liuchao
 * date:2019/6/12
 * function：库存清单
 * */
public class Inventory {
    public static void main(String[] args) {
        //定义属性变量
        String brand1 = "MacBookAir";
        String brand2 = "ThinkpadT420";
        String brand3 = "ASUS-FL5800";
        double size1 = 13.3;
        double size2 = 14.0;
        double size3 = 15.6;
        double price1 = 6988.88;
        double price2 = 5999.99;
        double price3 = 4999.99;
        int inventory1 = 5;
        int inventory2 = 10;
        int inventory3 = 15;
        int total_inventory;
        double total_amount;

        System.out.println("================库存清单=============");
        System.out.println("品牌          尺寸      价格      数量");
        System.out.println(brand1 + "    " + size1 + "      " + price1 + "   " + inventory1);
        System.out.println(brand2 + "  " + size2 + "      " + price2 + "   " + inventory2);
        System.out.println(brand3 + "   " + size3 + "      " + price3 + "   " + inventory3);
        //计算总库存
        total_inventory = inventory1 + inventory2 + inventory3;
        //计算总金额
        total_amount = price1 + price2 + price3;
        System.out.println("====================================");
        System.out.println("总库存数：" + total_inventory);
        System.out.println("总金额数：" + total_amount);
    }
}
