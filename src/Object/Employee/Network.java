package Object.Employee;

public class Network extends Maintainer implements Work{
    public Network(int id,String name){
        super(id,name);
    }

    @Override
    public void work() {
        System.out.println("正在维护网络环境");
    }
}
