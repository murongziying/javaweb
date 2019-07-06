package test;

/*
 * 作者：刘超
 * 日期：2019/3/16
 * 功能：数组逆序
 * */
public class ArrayTest {
    public static void main(String[] args) {
        int[] arr = {3, 76, 29, 1, 45, 8};
        arrayPrint(arr);
        reverseArray(arr);
        arrayPrint(arr);
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

    public static void reverseArray(int[] arr) {
        for (int min = 0, max = arr.length - 1; min < max; min++, max--) {
            int temp = arr[min];
            arr[min] = arr[max];
            arr[max] = temp;
        }
        System.out.println();
    }
}
