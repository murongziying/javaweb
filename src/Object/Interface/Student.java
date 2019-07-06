package Object.Interface;
/*
* 作者：刘超
* 日期：2019/3/28
* 功能：实现接口
* */
public class Student extends Person implements Study{
    @Override
    public void study() {
        System.out.println("学生在学习！！！");
    }
}