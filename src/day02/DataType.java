package day02;

/*
 * author：liuchao
 * date:2019/6/12
 * function：基本数据类型
 * */
public class DataType {
    public static void main(String[] args) {
        byte a = 127;   //1字节  2^8  -128-127
        short b = 256;  //2字节  2^16
        int c = 1024;   //4字节  2^32
        long d = 2048;  //8字节  2^64
        float e = 1.25f;//4字节  2^32
        double f = 3.14;//8字节  2^64
        char g = 'A';   //2字节  2^16
        boolean h = true;//1字节 2^8
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);
        System.out.println(g);
        System.out.println(h);
    }
}
