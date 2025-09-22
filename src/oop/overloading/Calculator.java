package oop.overloading;

public class Calculator {
  //오버 로딩  -> 중복 선언 -> 생성자도 가능하고 메서드도 가능한 문법
  //매개변수로 오버로딩 조정 - >> 개수 , 순서 ,데이터 타이입 세가지중 하ㄴ나마 ㄴ 다르더라도 인정
   int add(int n1 ,int n2){
       System.out.println(n1+n2);
         return  n1+n2;
    }
    void  method1(int n1){}
    void  method1(int n1,int n2){}
    void  method1(String  s){}
    void  method1(int i, double d){}
    void  method1(double d, int i){}


}
