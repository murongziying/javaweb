package test;

/*
 * 作者：刘超
 * 日期：2019/3/16
 * 功能：数组排序
 * 两种数组的排序方式：
 *      1.选择排序：数组中每个元素进行比较
 *      2.冒泡排序：数组中相邻的元素比较
 *      规则：比较大小，交换位置
 * */
public class ArrayTest_1 {
    public static void main(String[] args) {
        int[] arr = {5, 8, 2, 6, 9};
        choose(arr);
        arrayPrint(arr);
    }

    public static void choose(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

    public static void arrayPrint(int[] arr) {
        //首先加入一个中括号
        System.out.print("[");
        //开始遍历数组
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1) {
                //在最后一个数组元素的时候加入中括号
                System.out.print(arr[arr.length - 1] + "]");
            } else {
                System.out.print(arr[i] + ",");
            }
        }
    }
}