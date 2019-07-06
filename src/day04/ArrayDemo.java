package day04;

/*
 * author：liuchao
 * date:2019/6/19
 * function：数组定义
 * */
public class ArrayDemo {
    public static void main(String[] args) {
        int[] arr = new int[5];
        arr[0] = 1;
        arr[1] = 3;
        arr[2] = 5;
        arr[3] = 7;
        arr[4] = 9;
        System.out.println(arr[3]);
        System.out.println(arr.length);
        // System.out.println(arr[7]); java.lang.ArrayIndexOutOfBoundsException: 7
        // 数组越界异常
        // arr = null;
        // System.out.println(arr[1]); java.lang.NullPointerException 空指针异常

    }
}
