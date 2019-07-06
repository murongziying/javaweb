package Object;

/*
 * 作者：刘超
 * 2019/3/20
 * 功能：测试基本数据类型与引用数据类型的区别
 * 基本数据类型变量a作为参数传递的过程中，由于变量定义在main方法中，所以变量的位置
 * 是在main方法中，当具体方法调用a变量时，虽然function方法中对a变量进行修改，但是由于
 * function方法结束之后a的值也随之结束，所以a的值不会改变，因为所有的数据和方法都在
 * 方法栈中
 *
 * 而引用数据类型参数，由于会在方法堆中开辟空间存储对象，而且引用数据类型实际上只是一个
 * 内存的地址空间，所以在调用的过程中，只要地址空间中的数值发生改变，整个对象的值都随之
 * 发现改变
 * */
class Person_1{
     String name;
}

public class PersonTest {
    public static void main(String[] args) {
        int a = 1;
        Person_1 p = new Person_1();
        p.name = "刘超";
        changeName(p);
        function(a);
        System.out.println("基本数据类型变量作为方法参数传递是的结果是：" + a);
        System.out.println("引用数据类型作为方法参数传递过程的结果是："+p.name);
    }

    public static void function(int a) {
        a += 5;
    }

    public static void changeName(Person_1 p){
        p.name = "liuchao";
    }
}


class PersonTest_1{
    //私有变量的访问
    public static void main(String[] args){
        Person p = new Person();
        p.setAge(30);
        p.setName("刘超");
        p.spack();
    }
}

class Person_2{
    private String name;
    private int age;

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setAge(int age){
        this.age = age;
    }

    public int getAge(){
        return age;
    }

    public void spack(){
        String name = "刘超";
        int age = 26;
        System.out.println("姓名："+name+" 年龄："+this.age);
        /*
        * 方法中访问局部变量和成员变量的区别
        * 加this就是访问成员变量，不加this就是访问
        * 局部变量
        * name访问的是局部变量，this.age访问的是成员变量
        * */
    }
}

class PersonTest_2{
    //测试this关键字用来区别成员变量和局部变量
    //this和p2对象表示同一个地址空间，所以this表示整个对象
    public static void main(String[] args){
        Person_2 p2 = new Person_2();
        p2.setAge(18);
        p2.setName("liuchao");
        p2.spack();
    }
}