package oop.fieldlocal;

public class Person {
    String name;
    int age;
    int i =30;//매개 변수 (parmater) -> 메소드를 호출할 때 전들해야 하는 값
  public String hello(String country) {
        int i = 30;
      System.out.println("int :" + 30);
      System.out.println(name + "이(가) 인사를 합니다");
      if (country.equals("한국")) {
          return "안녕하세요";
      } else if (country.equals("미국")) {
          return "hello";
      } else if (country.equals("일본")) {
          return "곤니찌와";
      }else {
          //리턴타입 스트링이라 했으면 어떤 상황에서도 그 타입에 맞는것을 리턴
          return "다른나라";
      }


  }
}
