package oop.static_.calc;

public class Calculator {
            /*
                     - 계산기마다 색깔이 각각 다를 수 있기 때문에 color같은 변수는
                      데이터를 공유시키지 말고, 객체별로 따로 관리해야 합니다.

                     - 반면에 pi같은 원주율값은 계산기마다 값이 동일해야 하기 때문에
                      static을 붙여서 데이터를 공유하게 하는 것이 유리합니다.
                 */
    String corol;
   static double pi = 3.14159265;

    /*
    - 메서드 내부에서 non-static 데이터를 참조하고 있는 메서드는
     해당 변수의 정확한 위치 (객체의 주소값)를 알려줘야 하기 때문에
     static 메서드로 선언하기 부적절 합니다.
     */

   public  void paint(String corol){
       System.out.println("계산기에" +corol+"색칠한다");
       //this는 할 필요가 없다
       //this 사용할꺼면 static 붙이지말아라
       this.corol=corol;
   }

   //이 매서드는 구지 객체를 부를 필요가 벗다
    //계산기마다 원덟이 구하는 공식이 있냐 ? 이것도아니고
   public static double calcAreaCircle(int r){
          return pi * r * r;
   }

}
