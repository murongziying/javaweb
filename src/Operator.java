/*
 * author:linuxc
 * date:2018.7.14
 * application:运算符
 * */
public class Operator {
    //常规运算符
    public static void main(String[] args) {
        int a, b, add, sub, mul, div, mod;
        a = 10;
        b = 5;
        add = a + b;        // add = 10 + 5
        sub = a - b;        // sub = 10 - 5
        mul = a * b;        // mul = 10 * 5
        div = a / b;        // div = 10 / 5
        mod = a % b;        // mod = 10 % 5
        System.out.println(add);        // 15
        System.out.println(sub);        // 5
        System.out.println(mul);        // 50
        System.out.println(div);        // 2
        System.out.println(mod);        // 0
    }
}

class Operator_1 {
    //自增自减
    public static void main(String[] args) {
        int a = 1;
        int b = a++;        // b = a, a = a + 1; ==>  b = 1, a = 2;
        int c = ++a;        // a = a + 1, c = a; ==>  a = 3, c = 3;
        int d = 7;
        int e = d--;        // e = d, d = d - 1; ==>  d = 6, e = 7;
        int f = --d;        // d = d - 1, f = d; ==>  d = 5, f = 5;
        System.out.println(a);      // a = 3
        System.out.println(b);      // b = 1
        System.out.println(c);      // c = 3
        System.out.println(d);      // d = 5
        System.out.println(e);      // e = 7
        System.out.println(f);      // f = 5
    }
}

class Operator_2 {
    //赋值运算符
    public static void main(String[] args) {
        int a = 3;
        byte b = 5;
        a += 2;       // a = a + 2, ==> a = 5;
        b -= 4;
        /*b = b - 4, ==> b = 1;
        因为4默认是int类型，而b定义为byte类型
        所以用赋值运算可以自动转换b-=4; == b = (byte)(b -4)*/
        a *= 2;       // a = a * 2, ==> a = 10;
        a /= 5;       // a = a / 5, ==> a = 2;
        a %= b;       // a = a % b, ==> a = 2 % 1, ==> a = 0
        System.out.println(a);      // a = 0
        System.out.println(b);      // b = 1
    }
}

class Operator_3 {
    //比较运算符
    public static void main(String[] args) {
        int a = 5;
        int b = 7;
        boolean b1 = (a == b);      // 5 == 7,false
        boolean b2 = (a != b);      // 5 != 7,true
        boolean b3 = (a > b);       // 5 > 7,false
        boolean b4 = (a < b);       // 5 < 7,true
        boolean b5 = (a <= b);      // 5 <= 7,true
        boolean b6 = (a >= b);      // 5 >= 7,false
        System.out.println(b1);     // false
        System.out.println(b2);     // true
        System.out.println(b3);     // false
        System.out.println(b4);     // true
        System.out.println(b5);     // true
        System.out.println(b6);     // false
    }
}

class Operator_4 {
    public static void main(String[] args) {
        boolean b1 = (2 > 1 & 1 == 1);      // true & true = true,   false & true = false,  false & false = false;
        //两个条件同时为真则为真
        boolean b2 = (1 < 2 | 1 == 1);      // true | true = true,   false | true = true,   false | false = false;
        //两个条件只要有一个为真就为真
        boolean b3 = (1 < 2 ^ 1 == 1);      // true ^ true = false,  false ^ true = true,   false ^ false = false;
        //两个条件结果不一致则为真
        boolean b4 = (!(1 > 2));          // !false = true;
        //去反
        boolean b5 = (1 > 2 && 1 == 1);     // true && true = true,   false && true = false,  false && false = false;
        boolean b6 = (1 < 2 || 1 == 1);     // true || true = true,   false || true = true,   false || false = false;
        System.out.println(b1);         // true
        System.out.println(b2);         // true
        System.out.println(b3);         // false
        System.out.println(b4);         // true
        System.out.println(b5);         // false
        System.out.println(b6);         // true
        int a = 2;
        int b = 3;
        System.out.println((a < b) && (++a == b));
        /*
         * && 一边为false，另外一边则不运行
         * 因为没有必要，逻辑“与”只要一个条件为false整个条件都为false
         * 只有当有一个条件为真时，才需要去判断另外一个条件的真假
         * 这样才能确定最终总条件的真假
         * */
        System.out.println((a < b) || (a == b));
        /*
         * || 只要有一个条件为true，另外一个条件则不执行
         * 因为“或”只要有一个条件为真，整个条件都为真
         * 只有当有一个条件为假的时候才需要去判断
         * 另外一个条件的真假可以决定总条件的真假
         * */
    }
}

class Operator_5 {
    public static void main(String[] args) {
        System.out.println(1 > 1 ? "Yes" : "No");
        // 判断条件？true(结果一):false(结果二)
    }
}