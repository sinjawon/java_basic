package oop.constructor;

public class Main {
    public static void main(String[] args) {
        Phone basic = new Phone();
        Phone galaxy = new Phone("머델");
        Phone iphone = new Phone("아이폰17 프로","미드나잇 그레이");

        basic.showSpec();

        System.out.println("====================================");

        galaxy.showSpec();

        System.out.println("====================================");
        
        iphone.showSpec();
    }
}
