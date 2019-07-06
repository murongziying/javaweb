/*
 * 作者：liuchao
 * 时间：2018.7.28
 * 功能：关键字、注释、标识符
 * 注释：//表示单行注释
 * */
/*
 * 表示多行注释
 * */

/**
 * 表示文档注释
 */
/*
 * public static void main class int long等等都是Java定义好的关键字
 * */
/*
 * 标识符：类名、方法名等自定义的名字都可以被称为标识符
 * 标识符的定义规则：大小写字母（A-Z、a-z），数字（0-9），下划线（_），美元符号（$）
 * 首字母必须以字母开头
 * */
public class Keyword {
    public static void main(String[] args) {
        System.out.println("关键字标识符注释");
        //常量数据类型
        System.out.println("0B11111");// = 31
        //二进制数据常量
        System.out.println(32);
        //十进制数据常量
        System.out.println(011);// = 15
        //八进制数据常量
        System.out.println(0X11);// = 17
        char a = 'A';
        System.out.println(a);
        //字符常量
        System.out.println(9.00);
        //浮点型数据常量
        System.out.println("ni hao");
        //字符串常量
        System.out.println(true);
        System.out.println(false);
        //布尔型常量
    }
}
