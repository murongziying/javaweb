package Object.Employee;

public class Test {
    public static void main(String[] args){
        Android a = new Android(1001,"Ubuntu");
        System.out.println(a.getId()+a.getName());
        a.work();

        Java j = new Java(1002,"Chrome");
        System.out.println(j.getId()+j.getName());
        j.work();

        Network n = new Network(1003,"Firefox");
        System.out.println(n.getId()+n.getName());
        n.work();

        Hardware h = new Hardware(1004,"Linux");
        System.out.println(h.getId()+h.getName());
        h.work();
    }
}
