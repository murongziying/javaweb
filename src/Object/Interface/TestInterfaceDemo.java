package Object.Interface;

import static Object.Interface.InterfaceDemo.NUM;

/*
* 作者：刘超
* 日期：2019/3/26
* 功能：测试接口实现类
* */
public class TestInterfaceDemo {
    public static void main(String[] args){
        InterfaceDemoImpl i = new InterfaceDemoImpl();
        i.method();
        i.getSum(3,7);
        System.out.println(i.NUM);

        InterfaceDemoImpl1 j = new InterfaceDemoImpl1();
        j.function();
        j.getSum(1,4);
        j.method();
    }
}
