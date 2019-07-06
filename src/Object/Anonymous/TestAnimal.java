package Object.Anonymous;

/*
 * 作者：刘超
 * 日期：2019/4/1
 * 功能：实现匿名内部类的方法调用
 * */
public class TestAnimal {
    public static void main(String[] args){
        //父类引用子类对象
        Animal a = new Animal(){
            public void eat(){
                System.out.println("动物在吃东西");
            }

            public void sleep() {
                System.out.println("动物在睡觉");
            }
        };
        //利用父类对象调用子类方法
        a.eat();
        a.sleep();
    }
}
