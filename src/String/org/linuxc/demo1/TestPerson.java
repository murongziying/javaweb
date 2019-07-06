package String.org.linuxc.demo1;
/*
* 作者：刘超
* 日期：2019/4/09
* 功能：String方法
* */
public class TestPerson {
    public static void main(String[] args){
        Person p1 = new Person("张三",26);
        Person p2 = new Person("李四",30);
        boolean b = p1.equals(p2);
        System.out.println(b);

        Person p3 = new Person("王五",20);
        Person p4 = new Person("马六",20);
        boolean b1 = p3.equals(p4);
        System.out.println(b1);    }
}
