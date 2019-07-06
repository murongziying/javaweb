package day02;

/*
 * author：liuchao
 * date:2019/6/12
 * function：算术运算符
 * */
public class Operator {
    public static void main(String[] args) {
        int a = 5;
        int b = 6;
        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(a / b);
        System.out.println(b % a);
        //a++,先参与运算，然后再自增
        int c = (a++) + b;
        //++a，先自增，然后再参与运算
        int d = (++a) + b;
        System.out.println(c);
        System.out.println(d);
        //赋值运算符
        byte e = 2;
        //e += 1;   <==>   e = (byte)(e+1);
        e += 1;
        System.out.println(e);

    }
}
