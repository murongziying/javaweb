package Object;
/*
* 作者：刘超
* 日期：2019/3/17
* 功能：测试汽车类能否正常使用
* */
public class TestCar {
    public static void main(String[] args){
        Car car = new Car();
        car.color = "白色";
        car.number = 4;
        car.run();
    }
}
