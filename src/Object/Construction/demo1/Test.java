package Object.Construction.demo1;

public class Test {
    public static void main(String[] args){
        //调用有参数列表的构造方法
        Person p = new Person("刘超",26);
        System.out.println(p.getName());
        System.out.println(p.getAge());
        //调用无参数列表的构造方法
        Person p1 = new Person();
        p1.setAge(10);
        p1.setName("liuchao");
        System.out.println(p1.getAge());
        System.out.println(p1.getName());
    }
}
