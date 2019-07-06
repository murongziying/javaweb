package test;

/*
 * 作者：刘超
 * 日期：2019/3/17
 * 功能：二分法查找数组元素
 * */
public class ArrayTest_3 {
    public static void main(String[] args) {
        int[] arr = {3, 7, 1, 4, 9};
        ArrayTest_2.bubbling(arr);
        ArrayTest_2.arrayPrint(arr);
        System.out.println(search(arr, 7));
        System.out.println(binarySearch(arr, 9));
    }

    public static int search(int[] arr, int key) {
        for (int i = 0; i < arr.length; i++) {
            //被查找的元素与数组中的元素进行比较
            if (arr[i] == key) {
                //返回查找到的元素的索引
                return i;
            }
        }
        return -1;
    }

    public static int binarySearch(int[] arr, int key) {
        int min = 0;
        int max = arr.length - 1;
        int mid = 0;
        while (min <= max) {
            mid = (min + max) / 2;
            if (arr[mid] < key) {
                min = mid + 1;
            } else if (arr[mid] > key) {
                max = mid - 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}
