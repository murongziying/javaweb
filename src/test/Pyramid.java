package test;

/*
 * 作者：刘超
 * 日期：2019/7/13
 * 功能：打印金字塔
 * */
public class Pyramid {
    public static void main(String[] args) {
        int lay = 9;
        //打印的行数
        for (int i = 1; i <= lay; i++) {
            //打印空格的规律
            for (int n = 1; n <= lay - i; n++) {
                System.out.print(" ");
            }
            //打印*号的规律
            for (int j = 1; j <= (i - 1) * 2 + 1; j++) {
                //判断该层是否为第一层或者最后一层
                if (i == 1 || i == lay) {
                    System.out.print("*");
                } else {
                    if (j == 1 || j == (i - 1) * 2 + 1) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
            }
            //打印一行之后换行
            System.out.println();
        }
    }
}
