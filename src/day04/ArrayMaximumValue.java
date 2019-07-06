package day04;

/*
 * author：liuchao
 * date:2019/6/22
 * function：数组最值
 * */
public class ArrayMaximumValue {
    public static void main(String[] args) {
        int[] arr = {-1, 3, -23, -67, 6, 9, 1, 2, 85, 13, 8};
        int max = arr[0];
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("arr数组的最大值是：" + max);
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] < min) {
                min = arr[j];
            }
        }
        System.out.println("arr数组的最小值是：" + min);
    }
}
