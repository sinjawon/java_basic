package oop.final_.field;

public class Person {
    //생성하자마자 초기화 가능하다
    final String name;
    final String nation = "대한민국";
    int age;
  //fainal 변수는 불변의 값을 의미하기에 반드시 초기화가 필요
  //초기화는 직접해도되고 객체가 생성되자마자 생성자로 초기화 가능
    public Person(String name) {
        this.name = name;

    }
}
