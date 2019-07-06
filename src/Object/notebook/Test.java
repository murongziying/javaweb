package Object.notebook;

public class Test {
    public void main(String[] args){
        Notebook n = new Notebook();
        n.openComputer();
        //调用笔记本方法
        n.useUSB(new Mouse());
        //将接口作为参数传递，用实现类做实际参数传递
        n.useUSB(new Keyboard());
    }
}
