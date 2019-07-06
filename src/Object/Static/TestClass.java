package Object.Static;
/*
* 作者：刘超
* 日期：2019/4/1
* 功能：匿名内部类
* */
public class TestClass {
    public static void main(String[] args){
        new Smoking(){
            public void smoking() {
                System.out.println("人在吸烟");
            }
        }.smoking();
    }
}
