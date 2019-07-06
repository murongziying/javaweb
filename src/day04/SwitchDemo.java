package day04;
/*
 * author：liuchao
 * date:2019/6/19
 * function：Switch语句
 * */
public class SwitchDemo {
    public static void main(String[] args){
        switch (7){
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("工作日");
                break;
            case 6:
            case 7:
                System.out.println("休息日");
                break;
                default:
                    System.out.println("无法识别这个日期");
                    break;
        }
    }
}
