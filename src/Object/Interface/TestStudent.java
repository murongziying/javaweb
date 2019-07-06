package Object.Interface;
/*
* 作者：刘超
* 日期：2019/3/28
* 功能：测试学生类
* */
public class TestStudent {
    public static void main(String[] args){
        Student s = new Student();
        s.age = 26;
        s.name  = "刘超";
        s.study();
    }
}
