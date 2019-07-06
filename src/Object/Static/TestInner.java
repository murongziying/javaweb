package Object.Static;
/*
 * 作者：刘超
 * 日期：2019/4/1
 * 功能：测试内部类
 * */
public class TestInner {
    public static void main(String[] args){
        //内部类的调用
        //外部类.内部类 类名 = new 外部类.new 内部类;
        Outer.Inner i = new Outer().new Inner();
        i.Inner();
        //局部内部类的调用
        Outer o = new Outer();
        o.method();
    }
}
