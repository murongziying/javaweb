package String.org.linuxc.demo4;
/*
 * 作者：刘超
 * 时间：2019.7.26
 * 功能：静态方法
 * 注意点：静态方法不能访问非静态变量，但是非静态方法可以访问静态变量
 * */
public class Students {
    int age;
    String name;
    double price;
    static double total;

    public Students(int age,String name,double price){
        this.age = age;
        this.name = name;
        total+=price;
    }
    //返回一个静态方法
    //Java规则：类变量，原则上用类方法去访问和操作
    public static double getTotal(){
        return total;
    }
}

class demo{
    public static void main(String[] args){
        Students stu1 = new Students(25,"刘超",520);
        Students stu2 = new Students(29,"刘腾",460);
        System.out.println(Students.getTotal());
    }
}
