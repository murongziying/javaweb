/*
 * 作者：刘超
 * 日期：2018.9.22
 * 功能：随机点名器
 * */
import java.util.Random;
public class CallName {
    public static void main(String[] args) {
        //储存姓名数组中
        //数组中的数据类型是String
        String[] names = {"刘超", "刘涛", "刘明", "刘望","刘腾", "刘飞","刘海成"};
        //打印数组的长度
        System.out.println(names.length);
        //遍历数组
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }
        System.out.println("==================");
        //定义一个随机变量
        Random ran = new Random();
        //生成一个随机变量索引值
        int index = ran.nextInt(names.length);//index就是随机数，作为索引,所以这里就是0-6
        //nextint该方法的作用是生成一个随机的int值，该值介于[0,n)的区间，也就是0到n之间的随机int值，包含0而不包含n
        //利用随机变量索引值打印数组元素
        System.out.println(names[index]);
    }
}
