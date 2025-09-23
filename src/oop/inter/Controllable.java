package oop.inter;


//조종 가능한 자격증
//이 자격증을 따려면 아래에 명시한 모든 기능을 반드시 만들어야한다
public interface Controllable {

    //인터페이스 변수 선언하면 상수로 인식한다 (static final로)
       int num = 5;
    //인터 페이스는 메서드를 선언하면 추상메서드로 지정됩니다


    //생성자는 인터페이스엣 ㅓ허용 xxx
    //인터페이스는 생성자 가질수가 없다 ->> 객체화 될 수 없는 개념
   // public Controllable();

     void turnOn ();
     void turnOff();
     void moveForward();
     void moveBackward();
}
