package test;

/*
 * 作者：刘超
 * 日期：2019/7/9
 * 功能：判断两个数的大于、等于、还是小于
 * */

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class JudgeSize {
    public static void main(String[] args) {
        try {
            //输入流，从键盘接受数据
            InputStreamReader isr  = new InputStreamReader(System.in);
            BufferedReader br = new BufferedReader(isr);
            //给出提示信息
            System.out.println("请输入一个数值");
            String a = br.readLine();
            System.out.println("请输入另外一个数值");
            String b = br.readLine();
            //将字符串类型数据转换成float类型
            float num1 = Float.parseFloat(a);
            float num2 = Float.parseFloat(b);
            //比较a和b的大小
            if (num1 > num2) {
                System.out.println("a的值大于b");
            } else if (num1 == num2) {
                System.out.println("a的值等于b");
            } else {
                System.out.println("a的值小于b");
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
