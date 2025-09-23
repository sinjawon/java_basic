package oop.final_.constant;

public class Earth {
    //상수 고정된 불변의 값
    //상수는 모든것을 대문자로 표현
     static final double  RADIUS = 6400.0;

     //언더바로 두단어 연결
     static final double SURFACE_AREA;

     //스태틱도 생성자처럼 쓸수있는 문법이 있다

    static{
        //정적 초기화자 (static initializer) -> static 쪽의 생성자 느낌
        //정적 변수 등을 자동으로 초기화 해 주는 static 블록 입니다.
        //조건이 맞으면 자동으로 호출
        //클래스 로딩 , 클래스의 이름으로 static 멤버를 호출 또는 참조 하거나
        //객체가 생성되면 로딩된다.
        //정적 초기화자는 클래스 로딩 시 최초 1회만 호출된다
        SURFACE_AREA = 4 * Math.pow(RADIUS,2)* Math.PI;//메스포우 2성
    }
}
