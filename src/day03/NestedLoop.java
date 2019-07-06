package day03;
/*
 * author：liuchao
 * date:2019/6/17
 * function：嵌套for循环之打印乘法口诀表
 * */
public class NestedLoop {
    public static void main(String[] args){
        for(int i =1;i<10;i++){
            for(int j = 1;j<10;j++){
                //\t制表符，可以使乘法口诀表对齐
                System.out.print(i+"*"+j+"="+i*j+"\t");
            }
            System.out.println();
        }
    }
}
