package day03;

/*
 * author：liuchao
 * date:2019/6/12
 * function：if循环语句
 * */
public class IfCycle {
    public static void main(String[] args) {
        int a = 5;
        int b = 6;
        if (a == b) {
            System.out.println("这两个数相等");
        } else if (a > b) {
            System.out.println("a比b更大");
        } else if (a < b) {
            System.out.println("a比b更小");
        }
        //三元只能有一个判断条件，三元必须有确定的结果，三元代码简洁，清晰明了
        int x = 10;
        int y = 20;
        if (x > y) {
            System.out.println("x,y最大的数值是：" + x);
        } else {
            System.out.println("x,y最大的数值是：" + y);
        }

        int z = x > y ? x : y;
        System.out.println("x,y最大的数值是：" + z);

    }
}
