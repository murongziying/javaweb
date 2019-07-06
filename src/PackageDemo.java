/*
* 作者：刘超
* 日期：2019/2/26
* 功能：封装的练习
* */
public class PackageDemo {
    public static void main(String[] args){
        Person p = new Person();
        p.setAge(26);
        p.getAge();
        p.show();
    }
}
class Person{
    private String name;
    private int age;
    public void setAge(int a){
        if(a<0||a>130){
            System.out.println(a+"不符合年龄的数据范围");
            return;
        }
        age = a;
    }
    public int getAge(){
        return age;
    }
    public void show(){
        System.out.println("姓名："+name+"  年龄:"+age);
    }
}

class ThisDemo{
    private String name;
    private int age;
    public int getAge(){
        return this.age;
    }
    public void setAge(int age){
        this.age = age;
    }
    public void spack(){
        this.age = 26;
        this.name = "刘超";
        System.out.println("姓名是："+this.name+"  年龄是："+this.age);
    }
}

class ThisDemoTest{
    public static void main(String[] args){
        ThisDemo t = new ThisDemo();
        t.spack();
        t.setAge(26);
        t.getAge();
        System.out.println("年龄"+t.getAge());
    }
}

class PeerDemo{
    private String name;
    private int age;

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

    public boolean equalsAge(PeerDemo p){
        return p.age == this.age;
        //比较eauals对象的age和方法传递进来的p的age进行比较
    }
}