/*
 * 日期：2019/3/16
 * 作者：刘超
 * 功能：ASCII编码表
 * 0-9对应ASCII码48-57
 * A-Z对应ASCII码65-90
 * a-z对应ASCII码97-122
 * char数据类型取值范围是0-65535
 * char数据类型没有负数，char是无符号的数据类型
* */

package test;

public class ASCII {
    public static void main(String[] args){
        char ch = '0';
        char ch1 = 'A';
        char ch2 = 'a';
        char ch3 = (char)122;
        System.out.println(ch);
        System.out.println(ch1);
        System.out.println(ch2);
        System.out.println(ch3);
    }
}
