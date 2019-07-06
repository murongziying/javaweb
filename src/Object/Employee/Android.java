package Object.Employee;

public class Android extends Developer implements Work{
    public Android(int id,String name){
        super(id,name);
    }

    @Override
    public void work() {
        System.out.println("正在开发安卓程序");
    }
}
