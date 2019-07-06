package Object.Employee;

public class Java extends Developer implements Work{
    public Java(int id,String name){
        super(id,name);
    }

    @Override
    public void work() {
        System.out.println("正在开发Java程序");
    }
}
