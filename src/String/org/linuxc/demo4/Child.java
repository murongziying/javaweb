package String.org.linuxc.demo4;

/*
 * 作者：刘超
 * 时间：2019.7.25
 * 功能：定义类，成员变量，成员方法
 * */
public class Child {
    String name;
    int age;
    static int total = 0;

    public Child(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public static void joinChild() {
        total++;
        System.out.println("加入了一个小孩");
    }
}

class test1 {
    public static void main(String[] args) {
        Child ch1 = new Child(5, "小明");
        ch1.joinChild();
        Child ch2 = new Child(6, "小花");
        ch2.joinChild();
        Child ch3 = new Child(7, "小强");
        ch3.joinChild();
        System.out.println("现在一共有几个人：" + Child.total);
    }
}
