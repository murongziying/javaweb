package String.org.linuxc.demo4;

/*
 * 作者：刘超
 * 时间：2019.7.21
 * 功能：二维数组转置
 * */
public class ArrayTranspose {
    public static void main(String[] args) {
        int[][] array = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9},{4,5,6}};

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j]+" ");
            }
            System.out.println();
        }
    }
}
