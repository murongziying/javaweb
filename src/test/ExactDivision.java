package test;

import java.util.Scanner;

/*
 * 作者：刘超
 * 日期：2019/7/9
 * 功能：判断一个数是否可以被整除
 * */
public class ExactDivision {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入a的值");
        int a = scanner.nextInt();
        System.out.println("请输入b的值");
        int b = scanner.nextInt();
        if (a % b == 0){
            System.out.println("a能被b整除");
        }else {
            System.out.println("a不能被b整除");
        }
    }
}
