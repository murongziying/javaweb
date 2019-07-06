package Object.Extends.org.linucx.demo01;

public class Zi extends Fu {
    int i = 2;

    public void show() {
        int i = 3;
        System.out.println(i);  //调用自己的i
        System.out.println(this.i);  //调用本类中的i
        System.out.println(super.i);  //调用父类中的i
    }
}
