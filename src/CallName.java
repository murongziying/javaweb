/*
 * 作者：刘超
 * 日期：2018.9.22
 * 功能：随机点名器
 * */



import java.util.Random;
import java.util.ArrayList;
import java.util.Scanner;




import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;
import java.util.ArrayList;
import java.util.Scanner;
import java.sql.SQLSyntaxErrorException;
import java.util.Random;
import java.util.Scanner;
import java.util.ArrayList;


public class CallName {
    public static void main(String[] args) {
        //储存姓名数组中
        //数组中的数据类型是String
        String[] names = {"刘超", "刘涛", "刘明", "刘腾", "刘飞"};
        //打印数组的长度
        System.out.println(names.length);
        //遍历数组
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }
        System.out.println("==================");
        //定义一个随机变量
        Random ran = new Random();
        //生成一个随机变量索引值
        int index = ran.nextInt(names.length);//index就是随机数，作为索引,所以这里就是0-6
        //nextint该方法的作用是生成一个随机的int值，该值介于[0,n)的区间，也就是0到n之间的随机int值，包含0而不包含n
        //利用随机变量索引值打印数组元素
        System.out.println(names[index]);
    }
}


class CallName_1{
    public void main(String[] args){
        addName();
        System.out.println("随机点名器");
        switch (choose()){
            case 1:
                addName();
                break;
            case 2:
                printName();
                break;
            case 3:
                randomName();
                break;
                default:
                    System.out.println("没有这个功能，请输入1、2、3");
                break;
        }
    }
   public ArrayList<String> StudentName = new ArrayList<String>();
    public void addName(){
        StudentName.add("刘超");
        StudentName.add("刘飞");
        StudentName.add("刘腾");
    }
    public void printName(){
        System.out.println("所有人的姓名");
        for (int i=0;i<StudentName.size();i++){
            System.out.println(StudentName.get(i));
        }
    }
    public int choose(){
        System.out.println("请选择操作序号");
        System.out.println("1、添加学生姓名");
        System.out.println("2、查看所有学生名单");
        System.out.println("3、随机姓名");
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        return s;
    }
    public void randomName(){
        System.out.println("随机出来的姓名是：");
        Random random = new Random();
        int index = random.nextInt(StudentName.size());
        System.out.println(StudentName.get(index));
    }
}

class student{
    private int age;
    private String name;

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }

    public int getAge(){
        return this.age;
    }

    public void setAge(int age){
        this.age = age;
    }
}

class CallNameDemo {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
    }

    public void addStudent(int n) {
        for (int i = 0; i < n; i++) {
            student s = new student();
            Scanner sc = new Scanner(System.in);
            System.out.println("请输入第" + i + "个人的名字");
            String name = sc.next();
            s.setName(name);
            System.out.println("请输入第" + i + "个人的年龄");
            int age = sc.nextInt();
            s.setAge(age);
        }
    }
}