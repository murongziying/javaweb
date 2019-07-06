package Object.Interface;
/*
* 作者：刘超
* 日期：2019/3/28
* 功能：继承抽象类，并实现接口
* */
public class abstractTest extends abstractDemo implements InterfaceDemo{
    public void show(){
        System.out.println("继承抽象类中的方法，并重写");
    }

    public void method(){
        System.out.println("实现InterfaceDemo接口");
    }

    public int getSum(int a, int b) {
        return 0;
    }
}

