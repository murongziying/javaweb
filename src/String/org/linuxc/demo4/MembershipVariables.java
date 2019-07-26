package String.org.linuxc.demo4;

public class MembershipVariables {
    static int i=1;
    static {
        //该静态方法区只被执行一次
        i++;
    }
    public MembershipVariables(){
        i++;
    }

    public static void main(String[] args){
        MembershipVariables mv = new MembershipVariables();
        System.out.println(mv.i);//3
        MembershipVariables mv2 = new MembershipVariables();
        System.out.println(mv2.i);//4

    }
}
