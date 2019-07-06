package day03;

/*
 * author：liuchao
 * date:2019/6/18
 * function：continue重新再循环   对奇数或者偶数进行求和
 * */
public class ContinueDemo {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 0; i <= 100; i++) {
            if (i % 2 != 0) {
                //只要遇到continue就结束本次循环
                continue;
            }
            sum += i;
        }
        System.out.println(sum);
    }
}
