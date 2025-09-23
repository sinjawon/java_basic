package oop.poly.car;

public class CarShop {
    public  void carPrice(Car c){
        //좌항의 타입이 우항의 타입을 가질수 있느냐
        //
        if(c instanceof Sonata){
            System.out.println("쏘나타의 가격은 3000만원 입니다 .");
        } else if (c instanceof Tesla) {
            System.out.println("테슬라의 가격은 7000만원 입니다");
        }else {
            System.out.println("포르쉐 가격은 1.5억원입니다");
        }
    }
}
