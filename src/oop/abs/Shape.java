package oop.abs;


/*
     # 추상 클래스, 추상 메서드
     1. 추상 클래스의 메서드에 abstract를 붙이면 해당 메서드는
      실체가 없는 추상 메서드가 되며, 이 메서드는 상속을 통해 자식 클래스에서
      무조건 오버라이딩을 하도록 강요됩니다.
     2. 추상메서드는 실체가 존재하지 않는 틀 역할을 하기 때문에
      메서드의 바디 ({})부분이 없고, 세미콜론으로 메서드 선언을 마감합니다.
     3. 일반 클래스에서는 추상 메서드를 선언할 수 없습니다. 추상 메서드가
      하나라도 존재하는 경우에는 반드시 해당 클래스를 추상 클래스로 선언해야 합니다.
     4. 추상 클래스에 추상 메서드만을 선언할 필요는 없습니다.
      일반 멤버변수 및 메서드도 얼마든지 선언이 가능합니다.
     */


public abstract class Shape {
    String color;
    public Shape( String color) {
        this.color =color;
    }
    //메서드 정의하기 너무 다양하고 오버라이딩  죄다 할꺼다
    public abstract double calculateArea();

   //오버라이딩 강제로 하는거다
    public abstract double calculatePerimeter();

    //하나라도 abstract가 존재하면 추상매서드로한다
    public void displayColor() {
        System.out.println("이 도형의 색상 : " + this.color);
    }


    // 오버라이딩 금지.
    public final void displayInfo() {
        System.out.println("\n===== 도형 정보 =====");
        displayColor();
        System.out.println("도형 종류: " + this.getClass().getSimpleName());
        System.out.println("면적: " + calculateArea());
        System.out.println("둘레: " + calculatePerimeter());
        System.out.println("====================");
    }

}
