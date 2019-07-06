package day03;

import java.util.Random;

/*
 * author：liuchao
 * date:2019/6/12
 * function：Random引用数据类型的使用
 * */
public class RandomDemo {
    public static void main(String[] args) {
        //创建random对象
        Random random = new Random();
        System.out.println(random.nextInt(10));//0-9
        //产生1-100的随机数
        System.out.println(random.nextInt(100) + 1);//(0-99)+1
    }
}
