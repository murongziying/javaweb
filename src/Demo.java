/*
 * 作者：刘超
 * 日期：2019.1.12
 * 功能：随机数游戏
 * */

import java.util.Random;
import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Random ran = new Random();    //生成一个随机数
        int n = ran.nextInt(10);
        while (true) {
            Scanner sc = new Scanner(System.in);    //键盘输入一个正整数
            System.out.println("请输入一个数字");
            int m = sc.nextInt();
            if (n == m) {
                System.out.println("猜中了");
                break;
            } else if (n < m) {
                System.out.println("猜大了");
            } else if (n > m) {
                System.out.println("猜小了");
            }
        }
        System.out.println("游戏结束");
    }
}
