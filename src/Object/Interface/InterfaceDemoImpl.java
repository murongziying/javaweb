package Object.Interface;
/*
* 作者：刘超
* 日期：2019/3/26
* 功能：定义接口的实现类
*       定义类，重写接口中的抽象方法，
*       类实现接口，可以理解为继承
* */
public class InterfaceDemoImpl implements InterfaceDemo {
    public void method(){
        System.out.println("实现类，重写接口抽象方法");
        //接口中的成员变量
        //被static final 修饰，可以直接使用接口调用
        System.out.println(InterfaceDemo.NUM);
    }

    public int getSum(int a,int b){
        return a+b;
    }
}