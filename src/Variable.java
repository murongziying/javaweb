/*
 * 作者：刘超
 * 时间：2018.7.14
 * 功能：变量的定义
 * 注意事项：
 * 1、变量必须赋值才能使用
 * 2、定义的变量只在所定义的括号内有效
 * 3、变量不能重复赋值
 * */
public class Variable {
    public static void main(String[] args) {
        byte a = 1;
        //1个字节
        short b = 12;
        //2个字节
        int c = 123;
        //4个字节
        long d = 1234L;
        //8个字节
        float e = 12345.6f;
        //4个字节
        double f = 1234567.8;
        //8个字节
        char g = 'A';
        //2个字节
        boolean h = true;
        //1个字节
        System.out.println("byte数据类型a=" + a);
        System.out.println("short数据类型b=" + b);
        System.out.println("int数据类型c=" + c);
        System.out.println("long数据类型d=" + d);
        System.out.println("float数据类型e=" + e);
        System.out.println("double数据类型f=" + f);
        System.out.println("char数据类型g=" + g);
        System.out.println("boolean数据类型h=" + h);
        String name = "liuchao";
        //字符串定义，String属于引用数据类型
        System.out.println(name);
    }
}
