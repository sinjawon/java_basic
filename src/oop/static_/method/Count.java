package oop.static_.method;

public class Count {
    public int a;
    public static  int b;

    //인스턴스 메서드 : 객체별로 따로따로 행동 가는
    //호출할때객체 생성 필수
    public void m1(){
        System.out.println("this.a = " + a);
        System.out.println("this.b = " + b);
    }
    //스태틱 매서드 정적  공유기능 ,객체가 필요 없음
    //이놈은 this도 안된다
    public static void m2(){
        System.out.println("static method called");
        //스태틱은 객체생서없이 호출 가능 this가 띨 주소가 없음
        //스태틱이기때문에 스태틱 출력 가능하다
        System.out.println(b);
        //m1(); ->  객체가 생성되어야 하니못한다
    }
}
