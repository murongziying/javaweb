package Object.Interface;
/*
* 作者：刘超
* 日期：2019/3/26
* 功能：接口的定义
* 接口定义：
*       成员方法，全部抽象
*       不能定义带有方法体的方法
* 定义抽象方法：
*           public abstract 返回值类型 方法名字（参数列表）
*           修饰符public，写或者不写，都是public
*
*  接口中成员变量定义：
*           成员变量定义的具体要求：
*           要求：必须是常量
*           固定格式： public static final 数据类型 常量名 = 赋予的值；
*           public static final 三个修饰符可以不写，但是一样有效
* */
public interface InterfaceDemo {
    //在接口中定义抽象方法
    public abstract void method();
    public static final int NUM = 1;
    public abstract int getSum(int a,int b);
}
