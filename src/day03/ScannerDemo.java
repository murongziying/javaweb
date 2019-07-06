package day03;

import java.util.Scanner;

/*
 * author：liuchao
 * date:2019/6/12
 * function：Scanner引用数据类型的使用
 * */
public class ScannerDemo {
    public static void main(String[] args) {
        //创建新的Scanner对象
        Scanner scanner = new Scanner(System.in);
        //屏幕提示信息
        System.out.println("请输入任意字符：");
        //从键盘获取字符并打印在屏幕上
        System.out.println(scanner.nextLine());
    }
}
