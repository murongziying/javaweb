package Object.notebook;
/*
* 作者：刘超
* 日期：2019/3/30
* 功能：
* */
public class Notebook {
    public void openComputer(){
        System.out.println("打开笔记本");
    }

    public void closeComputer(){
        System.out.println("关闭笔记本");
    }

    public void useUSB(USB usb){
        usb.open();
        usb.close();
    }
}
