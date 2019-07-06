/*
* 作者：刘超
* 日期：2019/1/19
* 功能：类
* */
public class Class {
    public static void main(String[] args){

    }
}

class RiceCooker{
    //定义电饭煲的属性，品牌brand、容量capacity、颜色color
    String brand;
    double capacity;
    String color;
}

class AutoMobile{
    //定义汽车的属性，品牌brand、颜色color、大小size
    String brand;
    String color;
    double size;
}

class Student{
    //定义学生的属性、姓名name、年龄age、性别gender
    String name;
    int age;
    String gender;
}

class TestRiceCooker{
    public static void main(String[] args){
        //测试电饭煲类中的属性
        RiceCooker rc = new RiceCooker();
        rc.brand = "红双喜";
        rc.capacity = 30.0;
        rc.color = "白色";
        System.out.println("电饭煲的品牌："+rc.brand+"电饭煲的容量："+rc.capacity+"电饭煲的颜色："+rc.color);
        //测试汽车类中的属性
        AutoMobile a = new AutoMobile();
        a.brand = "大众";
        a.color = "棕色";
        a.size = 2.8;
        System.out.println("汽车的品牌："+a.brand+"汽车的长度："+a.size+"汽车的颜色："+a.color);
        //测试学生类中的属性
        Student s = new Student();
        s.name = "刘超";
        s.age = 26;
        s.gender = "男";
        System.out.println("学生的信息："+s.name+s.age+s.gender);
    }
}

class Phone {
    String color;
    String brand;
    double size;
}

class TestPhone{
    public static void main(String[] args){
        Phone p = new Phone();
        p.color = "蓝色";
        p.brand = "iphone";
        p.size = 4.0;
        System.out.println("iphone手机的信息："+p.brand+p.color+p.size);
    }
}
class TestPhone_1{
    public static void main(String[] args){
        Phone p1 = new Phone();
        Phone p2 = new Phone();
        p1.color = "白色";
        p1.brand = "华为";
        p1.size = 5.1;
        p2.color = "黑色";
        p2.brand = "荣耀";
        p2.size = 5.5;
        System.out.println("华为手机的信息："+p1.brand+p1.color+p1.size);
        System.out.println("荣耀手机的信息："+p2.brand+p2.color+p2.size);
    }
}