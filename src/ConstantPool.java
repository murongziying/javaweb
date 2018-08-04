/*
 * 作者：刘超
 * 时间：2018.6.4
 * 功能：测试常量池问题
 * */
public class ConstantPool {
    public static void main(String[] args) {
        Integer a = 100;
        Integer b = 100;
        Integer c = 200;
        Integer d = 200;
        System.out.println(a == b);
        System.out.println(c == d);
        System.out.println(a.equals(a)==b.equals(b));
        System.out.println(c.equals(c)==d.equals(d));
    }
}
