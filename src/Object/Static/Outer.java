package Object.Static;

public class Outer {
    int a = 1;
    class Inner{
        int a = 2;
        public void Inner(){
            int a = 3;
            System.out.println("外部类成员变量"+Outer.this.a);
            System.out.println("内部类成员变量"+this.a);
            System.out.println("内部类局部变量"+a);
        }
    }

    public void method(){
        class In{
            public void Inner(){
                System.out.println("局部内部类");
            }
        }
        In i = new In();
        i.Inner();
    }
}
