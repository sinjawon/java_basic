package etc.inner;

import oop.static_.utils.PrintUtil;

public class Main {
    public static void main(String[] args) {
        //1.인스턴스 내부 클래스 사용
        //반드시 바깥 클래스 객 체 먼저 필요하다
        Car myCar = new Car(50);
        Car.Engine myEmgine =myCar.new Engine();
        myEmgine.Start();

        PrintUtil.printLine();

        //2.외부매서드 호출 안하고 가능하다
        Car.TireSpec tire = new Car.TireSpec();
        tire.printInfo();

        PrintUtil.printLine();
        //3.이미되어있으니 이렇게하면된다
        myCar.drive(440);

    }
}
