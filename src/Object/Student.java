package Object;
/*
* 作者：刘超
* 日期：2019/3/23
* 功能：定义学生类
* */
public class Student {
    private String name;
    private int age;

    public void setName(String name){
        this.name = name;
    }

    public void setAge(int age){
        this.age = age;
    }

    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }
}
