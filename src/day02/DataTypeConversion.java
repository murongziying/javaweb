package day02;

/*
 * author：liuchao
 * date:2019/6/12
 * function：基本数据类型转换
 * */
public class DataTypeConversion {
    public static void main(String[] args) {
        byte a = 127;
        double c = 3.14;
        //a在参与a+129的运算过程中发生了自动类型转换，byte类型自动转换成int类型
        int b = a + 129;
        //c在参与运算时由于数据类型从大到小转换，所以需要进行强制转换，这样就导致了c的值损失了精度
        int d = (int) c + 5;
        System.out.println(b);
        System.out.println(d);
    }
}
