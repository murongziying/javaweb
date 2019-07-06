package String.org.linuxc.demo3;

public class Stringdemo4 {
    public static void main(String[] args){
        String s = "jisngxijiangonHLLFJS1324";
        int length = s.length();
        System.out.println(length);

        String s1 = s.substring(3,6);
        System.out.println(s1);

        String s2 = s.substring(5);
        System.out.println(s2);
    }
}
