package String.org.linuxc.demo3;

public class Stringdemo3 {
    public static void main(String[] args){
        String str1 = new String("abc");
        String str2 = "abc";
        System.out.println(str1);
        System.out.println(str2);

        System.out.println(str1==str2);//地址空间不同
        System.out.println(str1.equals(str2));//对象内容相同

        function();
        function_1();
    }

    public static void function(){
        byte[] bytes = {97,89,99,100};
        String s = new String(bytes);
        System.out.println(s);
    }

    public static void function_1(){
        char[] ch = {'a','b','c','d','e','f'};
        String s = new String(ch);
        System.out.println(s);

        String s1 = new String(ch,2,5);
        System.out.println(s1);
    }
}
