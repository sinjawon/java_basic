package oop.poly;
/*
- 자바에서는 하나의 클래스 파일에 여러 개의 클래스를 선언할 수 있습니다.
 밀접한 연관이 있는 클래스를 모아 놓기 위해 사용합니다.
- 단, 파일명과 동일한 클래스가 반드시 존재해야 하고,
 해당 클래스만 public으로 선언할 수 있습니다.
*/

class A {}
class B extends A {}
class C extends A {}
class D extends B {}
class E extends C {}
/*
          Object
            |
            A
         /    \
        B     C
        |     |
        D     E
 */

public class Basic {
    //다형성은 상속 관계에서 일어난다
    //부모타입의 객체에는 어떠한 변수도 들어올수가있다
    void test() {
        A a = new A();
        B b = new B();
        C c = new C();
        D d = new D();
        E e = new E();
        //이렇게하면 다운캐스팅처럼 가능하다
        //자식을 하위클래스로도 부른다고 한다
        //부모를 상위클래스로 부른다고 한다
        //상속이라 가능하다
        A v1 = new B();
        A v2 = new C();
        A v3 = new D();
        A v4 = new E();

        B v5 = new D();
        C v6 = new E();

        //형제 역전 고모 이딴건 안된다
        //부모가 같다고 자식끼리 관계가 있는것은 아니다.


        //  B v7 = new C();
        //  C v8 = new B();
        // B v9 = new E();

        //obect 세상의 어느변수는 죄다 들어갈수가있다
        //obect 타입의 변수에는 어떠한 객체도 들어올 수 있다.
        Object o1 = new A();
        Object o2 = new B();
        Object o3 = new C();
        Object o4 = new D();
        Object o5 = new E();
        Object o6 = new Basic();
        Object o7 = new String("할루");


    }
}
