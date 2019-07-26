package String.org.linuxc.demo4;

/*
 * 作者：刘超
 * 时间：2019.7.20
 * 功能：定义类，成员变量，成员方法
 * */
public class Person {
    //定义成员属性
    int age;
    String name;

    //定义构造方法
    public Person(int age, String name) {
        this.age = age;
        this.name = name;
    }

    //定义方法
    public void speak() {
        System.out.println("姓名：" + name + "  " + "年龄" + age + "我是一个好人");
    }

    public void jiSuan() {
        int sum = 0;
        for (int i = 0; i <= 1000; i++) {
            sum += i;
        }
        System.out.println("1+2+3+...+1000=" + sum);
    }

    public int jiSuan(int n) {
        int sum = 0;
        for (int i = 0; i <= n; i++) {
            sum += i;
        }
        return sum;
    }

    public int jiSuan(int n, int m) {
        return n + m;
    }

    public float jiSuan(float a, float b) {
        return a + b;
    }
}

class test {
    public static void main(String[] args) {
        //新建一个Person对象
        Person person1 = new Person(25, "刘超");
        //给第一个person对象赋值
        person1.age = 24;
        person1.name = "liuchao";
        //定义第二个person对象，将person1内存地址赋值给person2
        Person person2;
        person2 = person1;

        Person person3;
        person3 = person2;

        person3.age = 29;
        System.out.println(person2.name);
        System.out.println(person1.age);
        System.out.println(person3.age);
        person1.speak();
        person2.speak();
        person3.jiSuan();
        System.out.println("计算1+...+n=" + person1.jiSuan(9));
        System.out.println("两个数的和：" + person2.jiSuan(79, 9));
        System.out.println("计算两个float类型数值的和" + person1.jiSuan(5.2f, 6.3f));
    }
}