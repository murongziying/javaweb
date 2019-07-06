package test;

/*
 * 日期：2019/2/21
 * 作者：刘超
 * 功能：打印26个字母
 * */
public class Print_letter {
    public static void main(String[] args) {
        char da = 'A';
        char xiao = 'a';
        for (int i = 0; i < 26; i++) {
            System.out.print(da);
            da++;
        }
        System.out.print("\n");
        for (int j = 0; j < 26; j++) {
            System.out.print(xiao);
            xiao++;
        }
    }
}
