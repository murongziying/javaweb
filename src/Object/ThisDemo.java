package Object;
/*
 * 作者：刘超
 * 日期：2019/3/20
 * 功能：比较两个人是否是同龄人
 * */


class Person_3 {
    private int age;

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public boolean sizeAge(Person_3 p) {
        if (p.age == this.age){
            return true;
        }else {
            return false;
        }
    }
}


public class ThisDemo {
    public static void main(String[] args) {
        Person_3 p_other = new Person_3();
        Person_3 p_own = new Person_3();
        p_own.setAge(9);
        p_other.setAge(30);
        System.out.println(p_other.sizeAge(p_own));
    }
}
