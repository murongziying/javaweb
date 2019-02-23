/*
* 作者：刘超
* 日期：2019/2/23
* 功能：可变数组ArrayList
* */
import java.util.ArrayList;
public class ArrayListDemo {
    public static void main(String[] args){
        //创建ArrayList集合
        ArrayList<String> list = new ArrayList<String>();
        //向ArrayList集合中添加新的元素
        list.add("str1");
        list.add("str2");
        list.add("str3");
        list.add("str4");
        //打印ArrayList集合的长度
        System.out.println("list的长度是："+list.size());
        //打印指定位置的元素
        System.out.println(list.get(3));
        System.out.println(list.get(2));
        System.out.println(list.get(1));
        System.out.println(list.get(0));
        //ArrayList集合的遍历
        System.out.println("ArrayList集合的遍历");
        for(int i =0;i<list.size();i++){
            System.out.println(list.get(i));
        }
    }
}
