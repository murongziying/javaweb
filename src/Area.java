/*
 * 作者：刘超
 * 日期：2018/9/22
 * 功能：九三长方形面积
 * */

import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        int area = getArea();
        System.out.println("面积：" + area);
    }

    public static int getArea() {
        int width;
        int height;
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入长度：");
        width = scanner.nextInt();
        System.out.println("请输入高度：");
        height = scanner.nextInt();
        int area = width * height;
        return area;
    }
}