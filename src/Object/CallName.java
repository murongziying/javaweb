package Object;

import java.util.ArrayList;
import java.util.Random;

/*
 * 作者：刘超
 * 日期：2019/3/23
 * 功能：随机点名器
 *   1、添加所有学生
 *   2、打印所有学生
 *   3、随机出来一个学生
 * */
public class CallName {
    public static void main(String[] args) {
        //定义一个引用学生对象的集合
        ArrayList<Student> array = new ArrayList<Student>();
        addStudent(array);
        printStudent(array);
        randomStudent(array);
    }

    //定义添加学生信息的方法
    public static void addStudent(ArrayList<Student> array) {
        //创建新对象
        Student s1 = new Student();
        s1.setName("爸爸");
        s1.setAge(60);

        Student s2 = new Student();
        s2.setName("妈妈");
        s2.setAge(55);

        Student s3 = new Student();
        s3.setName("大哥");
        s3.setAge(30);

        Student s4 = new Student();
        s4.setName("二哥");
        s4.setAge(28);

        Student s5 = new Student();
        s5.setName("自己");
        s5.setAge(26);
        //将创建好的新对象添加进集合中
        array.add(s1);
        array.add(s2);
        array.add(s3);
        array.add(s4);
        array.add(s5);
    }

    //定义打印学生信息的方法
    public static void printStudent(ArrayList<Student> array) {
        for (int i = 0; i < array.size(); i++) {
            //i是集合的索引，通过get方法获取索引值对应的集合对象
            Student s = array.get(i);
            System.out.println("学生姓名："+s.getName()+"  学生年龄："+s.getAge());
        }
    }

    //定义随机学生的方法
    public static void randomStudent(ArrayList<Student> array){
        //创建随机数变量
        Random r = new Random();
        //通过集合长度，获取合理范围之内的集合索引值
        int index = r.nextInt(array.size());
        //通过集合索引寻找对象
        Student s = array.get(index);
        System.out.println("随机出来的学生是："+s.getName()+"  "+s.getAge());
    }
}
