package Object.Polymorphic;
/*
 * 作者：刘超
 * 日期：2019/3.28
 * 功能：抽象类的多态
 * */
public class TestCat {
    public static void main(String[] args){
        Animal a = new Cat();
        a.eat();
    }
}
