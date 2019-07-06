package day02;
/*
 * author：liuchao
 * date:2019/6/12
 * function：变量定义
 * 变量定义的规则：
 * 1、变量不赋值不能直接使用
 * 2、变量不能重复定义
 * 3、变量只在自己的作用域内有效
 * */
public class Variable {
    public static void main(String[] args){
        int a = 100;
        System.out.println(a);
        a+=100;
        System.out.println(a);
    }
}
