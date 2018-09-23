/*
 * 作者：刘超
 * 日期：2018/9/22
 * 功能：方法练习
 * */
import java.util.Scanner;
public class Method {
    public static void main(String[] args) {
        System.out.println("打印三行三列的*");
        printRect();
        System.out.println("打印一个整数");
        System.out.println(getNumber());
        System.out.println("打印m行，n个*号");
        printRect2();
    }
    //在屏幕中打印三行三列的*
    public static void printRect() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static int getNumber(){
        int number;
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个整数：");
        number = scanner.nextInt();
        return number;
    }

    public static void printRect2() {
        Scanner scanner = new Scanner(System.in);
        //确定需要打印的行数
        System.out.println("请输入打印的行数：");
        int m = scanner.nextInt();
        //确定每行需要打印的长度
        System.out.println("请输入打印的打印的长度：");
        int n = scanner.nextInt();
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
