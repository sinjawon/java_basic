package oop.basic;

public class Main {
    public static void main(String[] args) {
        //실제 객체가있어야한다
        //문법
        //메모리에 jvm에 펜클래스캑ㄱ체를 띄운다
       Pen redPen = new Pen();
       Pen bluePen = new Pen();
        redPen.price = 500;
        redPen.color = "빨강";
        redPen.penNo = "a001";
        bluePen.price = 600;
        bluePen.color = "파랑";
        bluePen.penNo = "a002";
        redPen.write();
        bluePen.write();

        redPen.penInfo();
        bluePen.penInfo();

    }
}
