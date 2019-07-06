package Object;

/*
 * 作者：刘超
 * 2019/3/20
 * 功能：对成员变量进行私有化，并且提供相应的访问方法
 * */
public class Person {
    private String name;
    private int age;

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
        if (age < 0 || age > 200) {
            System.out.println("请输入合理的年龄范围！！！");
            return;
        } else {
            this.age = age;
        }
    }

    public void spack() {
        System.out.println("姓名：" + getName() + " 年龄：" + getAge());
    }
}
