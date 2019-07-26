package String.org.linuxc.demo4;

/*
 * 作者：刘超
 * 时间：2019.7.27
 * 功能：封装
 * */
public class Employee {
    private int age;
    private String name;
    private double salary;
    //构造方法
    public Employee(String name,int age,double salary){
        this.age = age;
        this.name = name;
        this.salary = salary;
    }
    //通过公开的成员方法访问和控制私有的成员变量
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }
}
class demo1{
    public static void main(String[] args){
        Employee emp = new Employee("刘超",25,6500.0);
        System.out.println("员工姓名："+emp.getName()+"  年龄："+emp.getAge()+"  薪资："+emp.getSalary());
    }
}
