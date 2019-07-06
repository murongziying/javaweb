package Object.Employee;
/*
* 作者：刘超
* 日期：2019/3/31
* 功能：定义员工类
* */
public abstract class Employee {
    private int id;
    private String name;

    public Employee(int id,String name){
        this.id = id;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
