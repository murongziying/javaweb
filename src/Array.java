/*
 * 作者：刘超
 * 日期：2018.8.5
 * 功能：数组定义
 * */

import javax.sound.midi.SysexMessage;
import java.util.Random;
import java.util.Scanner;

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


class ArrayErgodic {
    //一维数组的遍历
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 7, 9,};
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}

class ArrayMaximumValue {
    //一维数组的最值
    public static void main(String[] args) {
        int[] arr = {32, 76, 87, 45, 72, 16, 20, 84};
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
        }
        System.out.println("arr的最小值是：" + min);
    }
}

class ArraySummation {
    //一维数组的求和
    public static void main(String[] args) {
        int[] arr = {15, 73, 24, 58, 95};
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println("arr的求和是：" + sum);
    }
}

class DoubleArrayErgodic {
    //二维数组的遍历
    public static void main(String[] args) {
        int[][] arr = {{10}, {20, 20}, {30, 30, 30}, {40, 40, 40, 40}};
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.println(arr[i][j]);
            }
        }
    }
}

class DoubleArraySummation {
    public static void main(String[] args) {
        //二维数组的求和
        int[][] arr = {{15, 25, 35}, {60, 70, 80}, {1, 2, 3, 4, 5}};
        int sum = 0;
        int groupSum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                groupSum += arr[i][j];
            }
            System.out.println("每个一维数组的求和：" + groupSum);
            sum += groupSum;
            groupSum = 0;
            //注意每次一维数组求和完成之后把当组的数据清零
            //不然下一次循环会把之气的数据也加上去
        }
        System.out.println("二维数组的求和：" + sum);
    }
}

class RandomRollCaller {
    public static void main(String[] args) {
        //随机点名器
        String[] className = {"慕容紫英", "韩菱纱", "柳梦璃", "云天河"};
        for (int i = 0; i < className.length; i++) {
            System.out.println(className[i]);
        }
        //预览全部名单
        System.out.println("===============");
        Random random = new Random();
        int num = random.nextInt(4);
        System.out.println("随机出来的是："+className[num]);
    }
}
/*
 * 需求分析：开发一个随机点名器
 * 1、需要有数组对全班人的姓名进行存储
 * 2、需要利用随机变量随机一个编号出来
 * 3、需要对每个人进行编号，需要利用数组的索引
 * 4、还需要有键盘输入
 * 5、屏幕打印输出
 * */