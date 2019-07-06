package Object.Extends.org.linucx.demo01;
/*
* 作者：刘超
* 日期：2019/3/24
* 功能：子类和父类中变量的区别
* 当子类和父类中同时存在同一个变量时
* 在调用子类对象时优先使用子类中的变量
* 因为父类中的变量是成员变量，并不能代表全部子类的属性
* 而每个独立的子类却可以代表自身的属性
* 就近访问原则
* */
public class Test {
    public static void main(String[] args){
        Zi z = new Zi();
        z.show();
    }
}
