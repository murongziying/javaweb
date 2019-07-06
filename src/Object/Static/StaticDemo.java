package Object.Static;
/*
* 作者：刘超
* 日期：2019/4/1
* 功能：static的使用
* */

public class StaticDemo {
    public static String name;
    public static int age;
    public String sex;
    //静态方法调用静态属性
    public static void show(){
        System.out.println(name+age);
    }
    //非静态方法调用非静态属性
    public void show2(){
        System.out.println(sex);
    }
}


class staticTest{
    public static void main(String[] args){
        StaticDemo s1 = new StaticDemo();
        s1.name = "liuchao";
        s1.age = 26;
        System.out.println(s1.name+"..."+s1.age);
        StaticDemo s2 = new StaticDemo();
        //静态修饰的变量是共用属性
        System.out.println(s2.name+"..."+s2.age);
        //静态修饰的变量可以直接用类名访问
        System.out.println(StaticDemo.name+"..."+StaticDemo.age);
    }
}