package oop.abs;

public class Main {
    public static void main(String[] args) {

       Shape c1 = new Circle("빨강",5.0);
       Shape c2 = new Circle("파랑",3.0);
       Shape t1 = new Triangle("노랑",3.0,4.0,5.0);
       Shape t2 = new Triangle("주황",7.0,6.0,5.0);

       Shape[] shapes = {c1,c2,t1,t2};
       for (Shape s : shapes) {
           s.displayInfo();
       }
       //추상클래스는 스스로 객체 생성하지 못한다
      //대신 자식클래스에 의해 생성이 가능한다

    }
}
