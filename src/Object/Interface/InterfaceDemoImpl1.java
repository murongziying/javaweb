package Object.Interface;
/*
* 作者：刘超
* 日期：2019/3/28
* 功能：接口的多实现
* */
public class InterfaceDemoImpl1 implements InterfaceDemo,InterfaceDemo1{
    public void method(){
        System.out.println("实现demo接口抽象方法");
    }

    public int getSum(int a,int b){
        return a+b;
    }

    public void function(){
        System.out.println("实现demo1接口抽象方法");
    }
}
