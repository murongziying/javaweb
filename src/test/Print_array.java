package test;
/*
 * 作者：刘超
 * 日期：2019/2/21
 * 功能：按给定格式打印数组
 * */

public class Print_array {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6};
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            if (i == array.length - 1) {
                System.out.print(array[i] + "]");
            } else {
                System.out.print(array[i] + ",");
            }
        }
    }
}
