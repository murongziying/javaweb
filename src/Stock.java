import java.util.Scanner;

/*
 * 作者：刘超
 * 日期：2019/1/18
 * 功能：保存商品的库存信息
 * */
class Stock_1 {
    public static void main(String[] args) {
        String[] model = {"Thinkpad E480", "Matebook 13", "acer Swift3"};
        int[] price = {4998, 5699, 4499};
        double[] size = {14.0, 13.0, 14.0};
        int sum = 0;
        System.out.println("============库存信息============");
        //打印电脑型号
        System.out.print("电脑型号：");
        for (int i = 0; i < model.length; i++) {
            System.out.print(model[i] + "   ");
        }
        System.out.println();
        //打印电脑价格
        System.out.print("电脑价格：");
        for (int i = 0; i < price.length; i++) {
            System.out.print(price[i] + "            ");
        }
        System.out.println();
        //打印电脑尺寸
        System.out.print("电脑尺寸：");
        for (int i = 0; i < size.length; i++) {
            System.out.print(size[i] + "            ");
        }
        System.out.println();

        for (int i = 0; i < price.length; i++) {
            sum += price[i];
        }
        System.out.println("库存总金额：" + sum);
        System.out.println("总的库存数：" + model.length);
    }
}

public class Stock {
    public static void main(String[] args) {
        //定义数组，商品的名称，尺寸，价格，库存数
        String[] brand = {"Thinkpad E480", "Matebook 13", "acerSwift3"};
        double[] size = {14.0, 13.0, 14.0};
        int[] price = {4998, 5699, 4499};
        int[] count = {2, 5, 8};
        //加一个while为了让自己可以决定退出的时间
        while (true) {
            //获取一个执行的序号
            int choose = chooseFunction();
            switch (choose) {       //匹配执行的序号，选择相应的方法
                case 1:
                    printStore(brand, size, price, count);      //查看库存信息
                    break;
                case 2:
                    update(brand, count);       //修改库存信息
                    break;
                case 3:
                    return;
                default:
                    System.out.println("无此功能！！！");
                    break;
            }
        }
    }

    public static void printStore(String[] brand, double[] size, int[] price, int[] count) {
        System.out.println("============商品库存信息===========");
        System.out.println("型号    尺寸     价格     库存数");
        int totalCount = 0;
        int totalMoney = 0;
        for (int i = 0; i < brand.length; i++) {
            System.out.println(brand[i] + "   " + size[i] + "   " + price + "   " + count);
            totalCount += count[i];
            totalMoney += count[i] * price[i];
        }
        System.out.println("总库存数是：" + totalCount);
        System.out.println("总金额数是：" + totalMoney);
    }

    public static int chooseFunction() {
        System.out.println("=========库存管理=========");
        System.out.println("1.查看库存清单");
        System.out.println("2.修改库存数");
        System.out.println("3.退出");
        System.out.println("请输入要执行的序号：");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        return number;
    }

    public static void update(String brand[], int count[]) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < brand.length; i++) {
            System.out.println("请输入" + brand[i] + "新的库存数");
            int newCount = sc.nextInt();
            count[i] = newCount;
        }
    }
}