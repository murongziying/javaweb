/*
 * 作者：刘超
 * 日期：2019/1/24
 * 功能：集合类
 * */

import java.util.ArrayList;
public class ArrayListDemo {
    public static void main(String[] args) {
        //定义一个ArrayList集合
        ArrayList<String> array = new ArrayList<String>();
        //给空的集合添加数据
        array.add("刘腾");
        array.add("刘飞");
        array.add("刘超");
        //打印集合的长度
        System.out.println("集合的长度：" + array.size());
        array.add("刘恋");
        array.add("刘涛");
        //打印获取索引号为2的元素
        System.out.println("索引号为2的元素是：" + array.get(2));
        System.out.println("集合的遍历");
        //对整个集合中的元素进行遍历
        for (int i = 0; i < array.size(); i++) {
            System.out.println(array.get(i));
        }
    }
}

class ArrayListDemo_1 {
    public static void main(String[] args) {
        ArrayList<Integer> array = new ArrayList<Integer>();
        array.add(1);
        array.add(2);
        array.add(3);
        array.add(4);
        //将索引2位置上添加，10，其余元素往后移动一个位置
        array.add(2, 10);
        for (int i = 0; i < array.size(); i++) {
            System.out.println(array.get(i));
        }
        //将2索引上的元素修改为100
        array.set(2, 100);
        for (int i = 0; i < array.size(); i++) {
            System.out.println(array.get(i));
        }
        //删除索引2上面的元素
        array.remove(2);
        for (int i = 0; i < array.size(); i++) {
            System.out.println(array.get(i));
        }
    }
}


/*
 * 作者：刘超
 * 日期：2019/2/23
 * 功能：可变数组ArrayList
 * */
class ArrayListDemo_2 {
    public static void main(String[] args) {
        //创建ArrayList集合
        ArrayList<String> list = new ArrayList<String>();
        //向ArrayList集合中添加新的元素
        list.add("str1");
        list.add("str2");
        list.add("str3");
        list.add("str4");
        //打印ArrayList集合的长度
        System.out.println("list的长度是：" + list.size());
        //打印指定位置的元素
        System.out.println(list.get(3));
        System.out.println(list.get(2));
        System.out.println(list.get(1));
        System.out.println(list.get(0));
        //ArrayList集合的遍历
        System.out.println("ArrayList集合的遍历");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}