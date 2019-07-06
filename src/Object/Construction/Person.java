package Object.Construction;
/*
* 作者：刘超
* 日期：2019/3/31
* 功能：定义父类
* */

public class Person {
    private String name;
    private int age;

    public Person(String name,int age) {
        this.name = name;
        this.age = age;
    }

    public Person(){
        System.out.println("这是一个空的构造方法");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
