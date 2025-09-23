package oop.modi.protec.pec2;
import oop.modi.protec.pac1.A;

public class C extends A{

   C(){
       this.m1();
      //디폴트라 this.m2();
       this.f1 = 10;
     //  this.f2 =20 ;  디폴트
   }
    //부분적으로 생성자 내부접근 허용
    void  test(){
       A a = new A();

    }
}
