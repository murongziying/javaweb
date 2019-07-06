package day03;
/*
 * author：liuchao
 * date:2019/6/12
 * function：for循环语句之嵌套循环
 * */
public class ForCycle1 {
    public static void main(String[] args){
        for(int i=1;i<10;i++){
            for(int j=1;j<10;j++){
                System.out.print(i+" * "+j+"="+i*j+"    ");
            }
            System.out.println();
        }
    }
}
