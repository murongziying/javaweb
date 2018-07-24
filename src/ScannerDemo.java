/*
 * author:linuxc
 * date:2018.7.14
 * application:键盘输入Scanner
 * */

import java.util.Scanner;

public class ScannerDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please input a number:");
        int a = sc.nextInt();
        System.out.println(a);
    }
}
