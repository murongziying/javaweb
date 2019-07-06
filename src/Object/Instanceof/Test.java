package Object.Instanceof;
/*
* 作者：刘超
* 日期：2019/3/28
* 功能：判断对象所有的类instanceof
* */
public class Test {
    public static void main(String[] args){
        Person p = new Student();       //多态向上转型
        Person p1 = new Teacher();
        boolean b = p instanceof Student;
        boolean b1 = p1 instanceof  Student;
        ((Student) p).sleep();
        ((Teacher) p1).sleep();
        System.out.println(b);
        System.out.println(b1);

        Student s = (Student) new Person();     //多态向下转型
        s.study();
    }
}
