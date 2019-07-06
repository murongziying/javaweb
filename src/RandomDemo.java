/*
 * 作者：刘超
 * 日期：2018.7.14
 * 功能：random随机数
 * */

import java.util.Random;

public class RandomDemo {
    public static void main(String[] args) {
        // 引用random数据类型
        Random ran = new Random();
        // nextInt(n),随机数的fan范围在0-(n-1)之间
        int a = ran.nextInt(100);
        // 0-99的随机数
        int b = ran.nextInt(100) + 1;
        // 产生1-100之间的随机数
        double c = ran.nextDouble();
        // 范围0.0-1.0
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}
