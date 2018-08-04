/*
 * author:linuxc
 * date:2018.7.14
 * application:显示商品库存
 * */
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
