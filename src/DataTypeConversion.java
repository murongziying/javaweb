/*
 * author:linuxc
 * date:2018.7.14
 * application:数据类型转换
 * */
public class DataTypeConversion {
    public static void main(String[] args) {
        byte a = 1;
        double b = a;   //byte型变量a自动转换为double型变量b
        System.out.println("转换之前的数据类型为byte a = " + a);
        System.out.println("自动转换之后的数据类型double b = " + b);
        double d = 10.5;
        int e = (int) d;    //double型变量d强制转换为int型变量e
        System.out.println("强制转换之前的数据类型double d = " + d);
        System.out.println("强制转换之后的数据类型int e = " + e);
    }
}

class DataTypeConversion_1 {
    public static void main(String[] args) {
        // short s1=1;
        // s1=s1+1;   不能编译成功，因为1为int类型，而s1是short，大数据类型往小数据类型需要强制转换。修正方案如下：
        short s1 = 1;
        s1 = (short) (s1 + 1);
        System.out.println(s1);
        short s2 = 1;
        s2 += 1;
        System.out.println(s2);
        // 可以编译成功，(s2 += 1) == (s2 = (short)(s2+1))赋值运算会自动进行强制数据类型转换
        // short s3=1,s4=1;
        // short sum=s3+s4; 这里是编译器从数据安全方面考虑，如果s1和s2都是较大的short类型数，可能会导致溢出，所以会要求强制转换到int
        short s3 = 1, s4 = 1;
        int sum = s3 + s4;
        System.out.println(sum);
    }
}
