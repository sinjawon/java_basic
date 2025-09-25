package etc.anonymous;

import oop.modi.cls.pac2.C;

public class Main {
    public static void main(String[] args) {

        Calculator cal;


      cal =  new AddCalculator();
      cal.operate(10,20);
      int r1= cal.operate(10,20);
      System.out.println("r1 = " + r1);

    //익명클래스 (인터페으스의 구현체를 즉석에서 선언후 사용
    cal = new Calculator(){
          @Override
          public int operate(int a, int b) {
              return a - b;
          }
      };
    int r2 =  cal.operate(50,27);
        System.out.println("r2 = " + r2);


        //극단적 문법 이다
     int r3 =  new Calculator(){
            @Override
            public int operate(int a, int b) {
                return a*b;
            }
        }.operate(20,4);
        System.out.println("r3 = " + r3);

        //람다식으로 해보쟈

        // 람다 (1.8 이상부터 사용 가능)
        // 사용 전제 조건
        // -> 반드시 인터페이스 안에 추상메서드가 1개여야 한다!
        //cal느 어차피 인터페이스 calulator 구현체인데 new 구지 하기 싫어
        // 다생략하겠다
        //return문이 한줄 이면 이렇게 가능
       /* cal = (a, b) {
            return a/b;
        };*/
       cal = (a, b) -> a/b;

       int r4 =  cal.operate(27,9);
        System.out.println("r4 = " + r4);


       cal = (n1,n2) ->{
           System.out.println("d담다식 여러줄쓰기");
           return n1 % n2 ;
       };
        int r5 = cal.operate(67, 8);
        System.out.println("r5 = " + r5);
    }
}
