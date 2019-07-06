package day03;
/*
 * author：liuchao
 * date:2019/6/17
 * function：break跳转语句
 * */
public class BreakDemo {
    public static void main(String[] args){
        for(int i =1;i< 5;i++){
            System.out.println("i="+i);
            if(i==3){
                //只要遇到break，整个循环结束
                //如果有两层循环，break结束的是单层循环
                break;
            }
        }
    }
}
