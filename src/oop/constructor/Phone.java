package oop.constructor;

public class Phone {
    String model;
    String color;
    int price;
    //생성자 선언 !
    //규칙이 있다
  Phone(){
      System.out.println("호출삐삐");
      model = "폴더폰";
      color = "회색";
      price = 200000;
  }

    void showSpec(){
        System.out.println("model = " + model);
        System.out.println("color = " + color);
        System.out.println("price = " + price + "원");

/*
 # 생성자 (Constructor)

 1. 생성자는 객체를 생성하는 역할을 하며, 그렇기 때문에
  클래스 내부에 반드시 하나 이상 존재해야 합니다.

 2. 만약 생성자가 하나도 존재하지 않는다면 JVM이 자동으로
  매개변수가 하나도 존재하지 않는 가장 기본 형태의 생성자를
  (default constructor)를 하나 만들어 줍니다.

 3. 생성자는 반드시 클래스 이름과 대/소문자까지 동일하게
  작성하여 선언하고, 리턴 타입이 존재하지 않습니다.

 4. 생성자 내부에는 객체가 생성되자마자 해야 할 로직들을
  기술할 수 있습니다.
 */

    }
    //생성자 오버로딩
    //갯수에 제한이 ㅇ없긴하지만 없더라도 제한이 있다
    //구분 <>> 매개변수의 성ㄴ
    Phone(String model){
        System.out.println("2번생성자 호출");
        this.model = model;
        this.color = "화이트";
        this.price = 1000000;
    }
    Phone(String model,String color){
        System.out.println("3번 생성자 호출");
        //생성된 그객체<< this
        this.model = model;
        this.color = color;
        this.price = 1200000;
    }


}
