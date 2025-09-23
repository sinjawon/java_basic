package oop.encap.bad;

public class MyBirth {
    int year;
    int month;
    int day;
    void birthInfo() {
        //형식지정 표준출력 함수
        //서식문자 이용 문자열조립 ,서식문자에 들어갈 값을 나중에 뫂멧팅
        //% d -> 정수 ,%f- > 실수 .%s->문자열
        System.out.printf("내 생일은 %d년 %d월 %d일 입니다."
                        , this.year, this.month, this.day);
    }
}
