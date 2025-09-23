package oop.abs;

public class Triangle  extends Shape  {


    //생성될때 부모가 생성되어야하니 이렇게 넣어줘야한다
    private double side1, side2, side3;
    public Triangle(String color ,double side1, double side2, double side3) {
        super(color);
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    @Override
    public double calculateArea() {
        //삼각형 세 변 다 알고있으면
        double s = (side1 + side2 + side3) / 2;
      //삼각형 구하기
        //sqrt는 루트씌울때
        return Math.sqrt(s*(s-side1)*(s-side2)*(s-side3));
    }

    @Override
    public double calculatePerimeter() {
        return side1 + side2 + side3;
    }
}
