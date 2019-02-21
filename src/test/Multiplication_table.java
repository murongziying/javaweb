package test;

/*
 * 日期：2019/2/21
 * 作者：刘超
 * 功能：乘法表
 * */
public class Multiplication_table {
    public static void main(String[] args) {
        for (int i = 1; i < 10; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i + "*" + j + "=" + i * j+"  ");
            }
            System.out.println();
        }
    }
}
