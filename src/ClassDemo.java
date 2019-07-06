/*
* 作者：刘超
* 日期：2019/2/25
* 功能：练习java类的编写
* */
public class ClassDemo {

}

class Car{
    int number;
    String color;
    void run(){
        System.out.println(color+"车有几辆"+number);
    }
}

class CarDemo{
    public static void main(String[] args){
        Car c = new Car();
        c.color = "白色";
        c.number = 10;
        c.run();
    }
}