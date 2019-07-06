/*
 * 作者：刘超
 * 日期：2019/2/15
 * 功能：计算1到100之间的奇数和
 * */
package test;

public class Odd_sum {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i < 100; i++) {
            if (i % 2 != 0) {
                sum = sum + i;
            }
        }
        System.out.println("1+3+5+...+99=" + sum);
    }
}

class Odd_sum_1 {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i < 100; i += 2) {
            sum += i;
        }
        System.out.println("1+3+5+...+99="+sum);
    }
}


