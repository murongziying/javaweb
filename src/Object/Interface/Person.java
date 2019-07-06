package Object.Interface;
/*
* 作者：刘超
* 日期：2019/3/28
* 功能：定义抽象类
* */
public abstract class Person {
    public int age;
    public String name;

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName(){
        return name;
    }
}
