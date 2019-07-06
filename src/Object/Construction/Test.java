package Object.Construction;
/*
* 作者：刘超
* 日期：2019/3/31
* 功能：测试构造方法
* */
public class Test {
    public static void main(String[] args){
        Student s = new Student("刘超",26);
        s.speak();
        Worker w = new Worker("超超",30);
        System.out.println(w.getName());
        System.out.println(w.getAge());
    }
}
