package oop.solid.lsp;

public class Square implements Shape {

    private int sideLength;//정사각형은 한 변만 있으면 됭


    public Square(int sideLength) {
        this.sideLength=sideLength;
    }

    @Override
    public int gerArea() {
        return sideLength*sideLength;
    }


}
