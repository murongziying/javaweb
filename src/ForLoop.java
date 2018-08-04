/*
 * author:linuxc
 * date:2018.7.17
 * application:for 循环语句
 * */
public class ForLoop {
    public static void main(String[] args) {
        for (int i = 1; i < 10; i++) {
            System.out.println(i);
        }
    }
}

class ForLoop1 {
    public static void main(String[] args) {
        // 计算1+2+3+...+10
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += i;
        }
        System.out.println(sum);
    }
}

class ForForLoop {
    public static void main(String[] args) {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < i + 1; j++) {
                System.out.print("1  ");
            }
            System.out.println();
        }
    }
}
