package oop.basic;

public class Pen {
    //객체 설계용 클래스에는 메인 함수를 작성하지 않습니다.
    //객체의 속성을 표현했다 ->>
    int price;
    String color;
    String penNo;

    // 객체의 기능을 표현한 함수 ->> 메서드 라고 부릅니다.
    //메서드 선언 해보자
    //괄호안에 전달하고 싶은 값을 넣어준다
    //함수는 동작을 실행하고 실행 결과값을 돌려 줄 수 있는 기능이 있습니다
    //함수 이름 앞에 돌려주는 값의 타입을 작성하는데 , 돌려줄 값이 없다면 void(빈 공허)
    //
   void write(){
        System.out.println( this.color + "색 글을 쓴다");
    }
    void penInfo(){
        System.out.println("제품번호: " + penNo);
        System.out.println(color + "색 펜의 가격은 " + price +"원 입니다.");
    }
}
