package day03;

import java.util.Random;
import java.util.Scanner;

/*
 * author：liuchao
 * date:2019/6/18
 * function：猜数字小游戏
 * */
public class GuessTheNumber {
    public static void main(String[] args) {
        //生成一个1-100的随机数
        Random random = new Random();
        int rm = random.nextInt(100) + 1;
        while (true) {
            //提示键盘输入信息
            System.out.println("请输入你猜测的数字：");
            Scanner scanner = new Scanner(System.in);
            int sc = scanner.nextInt();
            if (sc < rm) {
                System.out.println(" 猜小了");
                //如果条件成立则重新再循环一次
                continue;
            } else if (sc > rm) {
                System.out.println("猜大了");
                //如果条件成立则重新再循环一次
                continue;
            }else {
                System.out.println("恭喜你答对了");
                //如果条件成立则结束循环
                break;
            }
        }
    }
}
