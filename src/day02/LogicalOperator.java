package day02;
/*
 * author：liuchao
 * date:2019/6/12
 * function：逻辑运算符
 * */
public class LogicalOperator {
    public static void main(String[] args){
        /*
        * &  与  两个同时为true就为true
        * |  或  有任意一个为true就为true
        * ！ 非   取反
        * ^  亦或  两边条件不同则为true
        * && 短路与  只要有任意一边条件为false，另外一边则不运行
        * || 短路或  只要任意一边为true，另外一边则不运行
        * */
        System.out.println(true & false);//false
        System.out.println(true | false);//true
        System.out.println(!false);      //true
        System.out.println(true ^ false);//true
        System.out.println(false && true);//false
        System.out.println(false || true);//true
    }
}
