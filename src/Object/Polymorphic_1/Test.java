package Object.Polymorphic_1;
/*
* 作者：刘超
* 日期：2019/3/28
* 功能：多态中的成员变量
* 编译时看的是父类的变量，运行的是子类的变量
* 编译时看的是父类的防范，运行的是子类的方法
* */
public class Test {
    public static void main(String[] args){
        Fu f = new Zi();
        System.out.println(f.a);
        f.show();
    }
}
