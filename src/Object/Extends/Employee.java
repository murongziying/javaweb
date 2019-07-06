package Object.Extends;
/*
* 作者：刘超
* 日期：2019/3/23
* 功能：定义员工类
* */
public class Employee {
    String name;
    public void work(){
        System.out.println("现在正在工作");
    }
}


class Developer extends Employee{
    int age;
}

class TestExtends{
    public static void main(String[] args){
        Developer d = new Developer();
        d.name = "liuchao";
        d.age = 26;
        System.out.println(d.name+"今年"+d.age+"岁");
        d.work();
    }
}
