/*
 * 作者：刘超
 * date:2018.7.21
 * application:do while 循环
 * do ...while 循环
 * 格式：
 *   do{
 *      循环体
 *   }while（条件）;
 *   特点：无条件先执行一次
 * */
public class DoWhile {
    public static void main(String[] args) {
        int i = 0;
        do {
            System.out.println(i);
            i++;
        } while (i < 10);
    }
}
