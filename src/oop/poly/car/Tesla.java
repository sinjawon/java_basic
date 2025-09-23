package oop.poly.car;

public class Tesla extends Car {

    @Override
    public void run() {
        System.out.println("테슬라가 달려버려욧");
    }
    //테슬라 전용
    public void activeAtoPilot(){
        System.out.println("테슬라의 오토파일럿을 동작시킨다");
    }
}
