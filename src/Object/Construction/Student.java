package Object.Construction;
/*
* 作者：刘超
* 日期：2019/3/31
* 功能：定义子类
* */
public class Student extends Person{

    public Student(String name,int age){
        super(name,age);
    }

    public void speak(){
        System.out.println("名字："+super.getName()+"..."+"年龄："+super.getAge());
    }
}
