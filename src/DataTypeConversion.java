/*
 * author:linuxc
 * date:2018.7.14
 * application:数据类型转换
 * */
public class DataTypeConversion {
    public static void main(String[] args) {
        byte a = 1;
        double b = a;   //byte型变量a自动转换为double型变量b
        System.out.println("转换之前的数据类型为byte a = " + a);
        System.out.println("自动转换之后的数据类型double b = " + b);
        double d = 10.5;
        int e = (int) d;    //double型变量d强制转换为int型变量e
        System.out.println("强制转换之前的数据类型double d = " + d);
        System.out.println("强制转换之后的数据类型int e = " + e);
    }
}
