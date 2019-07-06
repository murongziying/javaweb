/*
* 作者：刘超
* 日期：2019/2/26
* 功能：联系方法中基本数据类型参数和引用数据类型参数之间的区别
* */
public class Parameter_passing {
    public static void main(String[] args){
        int x = 4;
        show(x);
        System.out.println("X="+x);
    }
    public static void show (int x){
        x = 5;
    }
    /*
    *基本数据类型的值不会随着方法改变
    * */
}

class Parameter_passing_1{
    int x;
    public static void main(String[] args){
        Parameter_passing_1 d = new Parameter_passing_1();
        d.x =5;
        show(d);
        System.out.println("X="+d.x);
    }
    public static void show(Parameter_passing_1 d){
        d.x = 6;
    }
    /*
    * 引用数据类型因为引用的是地址，所以上面的值会随着方法改变
    * */

}