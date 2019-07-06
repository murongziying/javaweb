package test;
/*
* 作者：刘超
* 日期：2019/2/23
* 功能：双色球算法
* */
import java.util.Random;
public class Two_color_ball {
    public static void main(String[] args) {
        int n = 33;
        Random rand = new Random();//新建一个随机类
        boolean[] bool = new boolean[n];
        int randInt = 0;
        for (int i = 0; i < 7; i++) {
            do {
                randInt = rand.nextInt(n);//产生一个随机数
            } while (bool[randInt]);
            bool[randInt] = true;
            System.out.println(randInt);
        }
    }
}