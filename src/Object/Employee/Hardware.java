package Object.Employee;

public class Hardware extends Maintainer implements Work{
    public Hardware(int id,String name){
        super(id,name);
    }

    @Override
    public void work() {
        System.out.println("正在维护硬件设施");
    }
}
