package test;
/*
 * 日期：2019/2/21
 * 作者：刘超
 * 功能：数组逆序
 * */

public class Array_reverse_order {
    public static void main(String[] args) {
        int[] array = {22, 33, 88, 44, 55};
        for (int start = 0, end = array.length - 1; start < end; start++, end--) {
            int tem = array[start];
            array[start] = array[end];
            array[end] = tem;
        }
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
