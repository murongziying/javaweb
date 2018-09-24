/*
 * 作者：刘超
 * 日期：2018.8.5
 * 功能：数组定义
 * */
public class Array {
    public static void main(String[] args) {
        //数组定义方式一
        System.out.println("数组在内存中的首地址：");
        int[] arr = new int[5];
        System.out.println(arr);  //这是数组在内存中的首地址：[I@6a38e57f
        System.out.println("=================");
        //访问数组中的索引
        System.out.println("访问数组中的索引");
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
        System.out.println(arr[3]);
        System.out.println(arr[4]);
        System.out.println("=================");
        //访问数组的长度
        System.out.println("访问数组中的长度");
        System.out.println(arr.length);
        System.out.println("=================");
        //数组定义方式二
        //这种定义方式中[]中不能写数字
        System.out.println("访问定义方式二：");
        int[] arr1 = new int[]{1, 2, 3, 5, 8, 13};
        //index                0,1,2,3,4,5
        System.out.println(arr1[4]);
        System.out.println(arr1.length);
        System.out.println("=================");
        //数组定义方式三
        System.out.println("访问定义方式三");
        int[] arr2 = {2, 4, 6, 8};
        System.out.println(arr2[0]);
        System.out.println(arr2.length);
        System.out.println("=================");
        //给数组赋值
        System.out.println("给数组中的元素赋值");
        arr2[0] = 1;
        System.out.println(arr2[0]);
        System.out.println("=================");
        //数组遍历
        System.out.println("数组遍历");
        for (int i = 0; i < arr2.length; i++) {
            System.out.println(arr2[i]);
        }
        System.out.println("=================");
        /*
         * 数组的异常一（越界异常）：
         * int [] arr = {5,2,0};
         * System.out.println(arr[5]);
         * 错误代码提示：Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 5
         * 数组的越界异常，因为数字arr索引最大为2
         *
         * 数组的异常二（空指针异常）：
         * int [] arr = {2,5,7};
         * System.out.println(arr[1]);
         * arr = null;
         * System.out.println(arr);
         * 错误代码提示：java.lang.NullPointerException
         * */
    }
}

class demo {
    public static void main(String[] args) {
        System.out.println(1 & 2);
        System.out.println(true && true);
    }
}

class DoubleArray {
    public static void main(String[] args) {
        //定义方式一：
        int[][] arr = new int[5][3];
        System.out.println(arr);
        System.out.println(arr[1][2]);
        //定义方式二：
        int[][] arr1 = new int[3][];
        arr1[0] = new int[6];
        arr1[1] = new int[5];
        arr1[2] = new int[4];
        //定义方式三：
        int[][] arr2 = {{1, 2, 3, 4}, {5, 6}, {7, 8, 9,}};
        System.out.println(arr2[1][1]);
    }
}