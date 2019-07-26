package test;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class test {
    public static void main(String[] args) {
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("请输入需要打印的行数：");
            for (int i = 1; i <= 5; i++) {
                for (int k = 1; k <= 5 - i; k++) {
                    System.out.print(" ");
                }
                for (int j = 1; j <= (i - 1) * 2 + 1; j++) {
                    if (i == 1 || i == 5) {
                        System.out.print("*");
                    } else {
                        if (j == 1 || j == (i - 1) * 2 + 1) {
                            System.out.print("*");
                        } else {
                            System.out.print(" ");
                        }
                    }
                }
                System.out.println();
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
