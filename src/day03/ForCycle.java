package day03;

/*
 * author：liuchao
 * date:2019/6/12
 * function：for循环语句
 * */
public class ForCycle {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 0; i <= 100; i++) {
            //连续整数求和1+2+3+...+100
            sum += i;
        }
        System.out.println(sum);
        //将上一个循环求和的sum清零
        sum = 0;
        //计算1+3+5+...+99和
        for (int j = 1; j <= 99; j = j + 2) {
            sum += j;
        }
        System.out.println(sum);
        //将上一个循环求和的sum清零
        sum = 0;
        //计算0+2+4+...+100和
        for (int k = 0; k <= 100; k = k + 2) {
            sum += k;
        }
        System.out.println(sum);
    }
}