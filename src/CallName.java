/*
 * 作者：刘超
 * 日期：2018.9.22
 * 功能：随机点名器
 * */

import java.sql.SQLSyntaxErrorException;
import java.util.Random;
import java.util.Scanner;

public class CallName {
    public static void main(String[] args) {
        //储存姓名数组中
        //数组中的数据类型是String
        String[] names = {"刘超", "刘涛", "刘明", "刘望", "刘腾", "刘飞", "刘海成"};
        //打印数组的长度
        System.out.println(names.length);
        //遍历数组
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }
        System.out.println("==================");
        //定义一个随机变量
        Random ran = new Random();
        //生成一个随机变量索引值
        int index = ran.nextInt(names.length);//index就是随机数，作为索引,所以这里就是0-6
        //nextint该方法的作用是生成一个随机的int值，该值介于[0,n)的区间，也就是0到n之间的随机int值，包含0而不包含n
        //利用随机变量索引值打印数组元素
        System.out.println(names[index]);
    }
}

class CallNameMethod {
    public static void main(String[] args) {
        //定义数组，存储学生姓名
        String[] names = new String[5];
        addStudent(names);
        printStudent(names);
        String name = randomStudent(names);
        System.out.println("随机出来的姓名是：" + name);
    }

    public static void addStudent(String[] names) {
        //"刘腾", "刘飞", "刘超", "刘恋","刘涛"
        //将所有学生姓名添加到数组中
        names[0] = "刘腾";
        names[1] = "刘飞";
        names[2] = "刘超";
        names[3] = "刘恋";
        names[4] = "刘涛";
    }

    public static void printStudent(String[] names) {
        //遍历所有学生姓名
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }
    }

    public static String randomStudent(String[] names) {
        //随机打印一个学生姓名
        Random random = new Random();
        int index = random.nextInt(names.length);
        return names[index];
    }
}
