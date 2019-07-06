package day04;

/*
 * author：liuchao
 * date:2019/6/22
 * function：二维数组
 * 二维数组第一个表示二维数组中一维数组的个数，第二个数值表示每个一维数组可以保存的个数
 * */
public class ArrayTwoDimensional {
    public static void main(String[] args) {
        int[][] arr = {{0, 1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        //二维数组的长度
        System.out.println("arr数组的长度" + arr.length);
        //二维数组中一维数组的长度
        System.out.println("arr二维数组中0元素一维数组的长度" + arr[0].length);
        //二维数组中第1个索引上中一维数组2索引中的元素
        System.out.println("二维数组中第1个索引上中一维数组2索引中的元素" + arr[1][2]);
        int[][] arr2 = new int[2][];
        arr2[0] = new int[]{1, 2, 3};
        arr2[1] = new int[]{4, 5};
        System.out.println("arr2[0][2]=" + arr2[0][2]);
        System.out.println("arr2[1][1]=" + arr2[1][1]);
        System.out.println("arr数组遍历");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.println(arr[i][j]);
            }
        }
    }
}
