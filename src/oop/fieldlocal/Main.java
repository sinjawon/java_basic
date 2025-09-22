package oop.fieldlocal;

public class Main {
    public static void main(String[] args) {
        Person kim = new Person();
        Person park = new Person();


        kim.age = 32;
        kim.name = "김철수";
        // 메서드를 호출했을 때 리턴값이 있다면 메서드를 호출한 곳으로 리턴된다
        // 그 리턴된 값은 변수에 담아서 할당할 수도 있고, 바로 출력하는 것도 가능합니다
        //이게 실행이되네
        String hello = kim.hello("한국");

        System.out.println("i의 값" + kim);
        //지역변수는 해당지역 외에는 지목할수가 없다
        //메서드 실행 끝 사이에만 존재한다고 생각해 방법이 없다
        System.out.println("hello = " + hello);
        System.out.println(hello == "안녕하세요");// true?? 이건맞군

        String s = new String("안녕하세요");
        //System.out.println(s == hello);
        //이퀄스가있다
        System.out.println(s.equals(hello));

    }
}
