/*
 * 作者：刘超
 * 时间：2018.8.22
 * 功能：数组定义
 * */
public class Arraydemo {
    public static void main(String[] args) {
        System.out.println("====s数组定义一====");
        int[] arr = new int[3];         //数组定义方式一
        System.out.println(arr);        //数组默认存放在jvm的堆中，
        System.out.println(arr[0]);     //数组的索引
        System.out.println(arr.length); //length数据长度

        System.out.println("====数组的定义二====");
        int[] arr1 = new int[]{2, 3, 5, 8}; //数组定义方式二
        System.out.println(arr1.length);
        System.out.println(arr1[3]);

        System.out.println("====s数组的定义三====");
        int[] arr2 = {1, 3, 5, 7, 9};   //数组定义方式三
        System.out.println(arr2[0]);
        arr2[2] = 10;                   //利用索引为数组赋值
        System.out.println(arr2[2]);

        System.out.println("====数组的遍历====");
        int[] arr3 = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9,};
        for (int i = 0; i < arr3.length; i++) {
            System.out.println(arr3[i]);
        }
        System.out.println("====数组的最值====");

        int[] arr4 = {3, 7, 1, 78, 25};
        int max = arr4[0];
        for (int i = 1; i < arr4.length; i++) {
            if (max < arr4[i]) {
                max = arr4[i];
            }
        }
        System.out.println(max);
    }
}