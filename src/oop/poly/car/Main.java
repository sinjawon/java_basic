package oop.poly.car;

//import oop.static_.utils.PrintUtil;
import oop.static_.utils.PrintUtil.*;

import static oop.static_.utils.PrintUtil.printLine;

public class Main {
    public static void main(String[] args) {
        Sonata s1 = new Sonata();
        Sonata s2 = new Sonata();
        Sonata s3 = new Sonata();

        Porsche p1 = new Porsche();
        Porsche p2 = new Porsche();
        Porsche p3 = new Porsche();

        Tesla t1 = new Tesla();
        Tesla t2 = new Tesla();
        Tesla t3 = new Tesla();
        Tesla t4 = new Tesla();

//        Sonata [] sonatas = {s1,s2,s3};
//        for(Sonata s:sonatas){
//            s.run();
//        }

        //소나타 는 car라는 부모가 있다  모든 연관 이있지않겠냐
     //다형성을 적용햇 ㅓ서로 다른 타입 객체를 모아놓을수 있다 (이종모음배열)
      Car[] cars = {s1,s2,s3,p1,p2,p3,t1,t2,t3,t4};
      for(Car c:cars){
          c.run();
      }
      //스태틱배웠으니까  한만등ㅇ보자
        //에드온디맨드 프린트임포트
         printLine();
     Driver kim =new Driver();
     kim.drive(t3);
     kim.drive(p2);
     kim.drive(s1);

         printLine();
       Car myTesla = kim.buyCar("테슬라");
       myTesla.run();
      Tesla t5 = (Tesla) myTesla;
      t5.activeAtoPilot();
        System.out.println(myTesla);
        System.out.println(t5);

        //object타입의 변수는 어떤 객체 담을수있다 객체 고융기능을 사용하려면
        //원래의 타입으로 형 변환이 필요합니다 (객체 2개생성 x)
       Object str = new String("메렁ㅁ렁");
       String s =(String) str;
        System.out.println(s.length());

        //다형성이 한 번도 발생하지 않은 경우에는
        //
        //형 변환을 진행할 수 없습니다

        //문법상문제는 없지만 생성자가 생성도안됬는ㄷ ㅔ이딴게 가능할리가 없잖아
        Car ccc= new Car();
       // Tesla ttt = (Tesla) ccc;
       // ttt.activeAtoPilot();

        printLine();

        CarShop carShop = new CarShop();
        carShop.carPrice(p2);
        carShop.carPrice(s1);
        carShop.carPrice(t4);
    }
}
