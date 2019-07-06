package test;

import java.math.*;
/*
 * 日期：2019/2/21
 * 作者：刘超
 * 功能：计算水仙花数
 * */

public class Daffodil_number {
    public static void main(String[] args) {
        for (int i = 100; i < 999; i++) {
            int bai = i / 100 % 10; //百分位取余运算
            int shi = i / 10 % 10;  //十分位取余运算
            int ge = i % 10;        //个分位取余运算
            if (i == Math.pow(bai, 3) + Math.pow(shi, 3) + Math.pow(ge, 3)) {
                System.out.println(i);
            }
        }
    }
}
