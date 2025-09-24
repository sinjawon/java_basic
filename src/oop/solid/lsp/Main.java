package oop.solid.lsp;

public class Main {

    public static void testArea(Shape r){

       //만약 메서드에서 두 도형이 모두 필요하다면 매개변수의 타입을 shape으로
       //Rectanle은 Rectangle 전용 매서드로
        //스퀘어는 스퀘어 전용 메서드로
       /*   if(r.getArea() != 50){
              System.out.println("계산 오류 기대값 :50,실재값" +r.getArea());
          }else {
              System.out.println("계산 정상!");
          }*/
    }

    public static void main(String[] args) {
        //같은 클래스 안에서는 클래스 이름을 생략가능하다
           testArea(new Rectangle(10,5));
           testArea(new Square(10));
    }
}
