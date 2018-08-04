/*
 * author:linuxc
 * date:2018.7.14
 * application:IF条件语句
 * */
import java.util.Scanner;

public class IfCondition {
    public static void main(String[] args) {
        int a = 9;
        if (a == 9) {
            System.out.println("if的条件为true");
            a++;
        }
        System.out.println("a = " + a);
    }
}

class IfConition_1 {
    public static void main(String[] args) {
        int a = 10;
        if (a % 2 == 0) {
            System.out.println(a + "是偶数");
            a %= 2;
        } else {
            System.out.println(a + "是奇数");
        }
        System.out.println("a % 2 = " + a);
    }
}

class IfConition_2 {
    // 判断一个学生的考试成绩的评级
    public static void main(String[] args) {
        int a;
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个学生的考试成绩：");
        a = sc.nextInt();
        if (a > 100) {
            System.out.println("你的分数已经超过满分，请确认分数是否合理");
        } else if (a >= 90) {
            System.out.println("优秀");
        } else if (a >= 70) {
            System.out.println("良好");
        } else if (a >= 60) {
            System.out.println("及格");
        } else {
            System.out.println("对不起，下学期来学校补考吧");
        }
    }
}

class IfCondition_3 {
    public static void main(String[] args) {
        int a, b, x, y;
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入a的值：");
        a = sc.nextInt();
        System.out.println("请输入b的值：");
        b = sc.nextInt();
        if (a > b) {
            System.out.println("a更大");
        } else if (a < b) {
            System.out.println("b更大");
        } else {
            System.out.println("a和b一样大");
        }
        Scanner sc1 = new Scanner(System.in);
        System.out.println("请输入x的值：");
        x = sc1.nextInt();
        System.out.println("请输入y的值：");
        y = sc1.nextInt();
        int z = x > y ? x : y;
        System.out.println("x、y更大的数是：" + z);
    }
}
class IfCondition_4{
    public static void main(String[] args){
        int i = 0;
        while(true){
            if (i == 5){
                break;
            }else {
                System.out.println(i);
            }
            i++;
        }
    }
}