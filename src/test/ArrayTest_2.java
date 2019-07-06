package test;

/*
 * 作者：刘超
 * 日期：2019/3/17
 * 功能：数组冒泡排序
 * */
public class ArrayTest_2 {
    public static void main(String[] args) {
        int[] arr = {2, 8, 1, 3, 9};
        bubbling(arr);
        arrayPrint(arr);
    }

    public static void bubbling(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
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
