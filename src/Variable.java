/*
* author:linuxc
* date:2018.7.14
* application:变量的定义
* */
public class Variable {
    static int allCilcks = 0;       //类变量
    String str = "Ubuntu1804";      //实例变量
    public void Variable(){
        int i = 0;                  //成员变量
        System.out.println(str);
        System.out.println(i);
    }
    public static void main(String []args){
        byte a = 1;
        short b = 12;
        int c = 123;
        long d = 1234L;
        float e = 12345.6f;
        double f = 1234567.8;
        char g = 'A';
        boolean h = true;
        System.out.println(allCilcks);
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
