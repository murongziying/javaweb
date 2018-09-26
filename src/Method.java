/*
 * 作者：刘超
 * 日期：2018/9/22
 * 功能：方法练习
 * */

import java.util.Scanner;

public class Method {
    public static void main(String[] args) {
        System.out.println("方法练习");
        System.out.println("==============");
        System.out.println("方法一：打印三行三列的*");
        printRect();
        System.out.println("方法二：打印一个整数" + getNumber());
        System.out.println("方法三：打印m行，n个*号");
        printRect2();
        System.out.println("方法四：计算三个数的平均数" + getAverage());
        System.out.println("方法重载");
        System.out.println("=============");
        System.out.println("方法的重载1：两个整数相加=" + getSum(2, 7));
        System.out.println("方法的重载2：两个小数相加=" + getSum(2.6, 7.4));
        System.out.println("方法的重载3：三个整数相加=" + getSum(2, 7, 8));
        System.out.println("方法参数传递");
        System.out.println("=============");
        int a = 1;
        int b = 2;
        transmit(a, b);
        System.out.println("参数传递后的a=" + a); //a = 1
        System.out.println("参数传递后的b=" + b); //b = 2
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

    public static int getNumber() {
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
        System.out.println("请输入打印的长度：");
        int n = scanner.nextInt();
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static double getAverage() {
        //计算三个数的平均数
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入第一个数：");
        double a = scanner.nextInt();
        System.out.println("请输入第二个数：");
        double b = scanner.nextInt();
        System.out.println("请输入第三个数：");
        double c = scanner.nextInt();
        double num = (a + b + c) / 3;
        return num;
    }

    //方法重载：在同一个类中，可以出现相同类名，但是参数类型、个数、顺序必须不同
    /*
    public static int getSum1(int a, int b) {
        return a + b;
    }

    public static double getSum2(double a, double b) {
        return a + b;
    }

    public static int getSum3(int a, int b, int c) {
        return a + b + c;
    }
    这三个方法同样实现的都是加法功能，但是每个不同的方法只能实现自己独特的功能，
    而不能让用户在无条件限制的情况下，可以轻松的实现加法运算。
    而方法重载的作用就是让同样是加法运算，用户可以灵活使用。
    */
    public static int getSum(int a, int b) {
        return a + b;
    }

    public static int getSum(int a, int b, int c) {
        return a + b + c;
    }

    public static double getSum(double a, double b) {
        return a + b;
    }
    /*
     * 重载注意事项：
     * 1、参数列表必须不同
     * 2、重载与参数变量名无关
     * 3、重载与返回值类型无关
     * 4、重载与修饰符无关
     * */


    //方法参数传递
    public static void transmit(int a, int b) { //a=1;b=2
        a = a + b;  //a = 3
        b = a + b;  //b = 5
    }
}
