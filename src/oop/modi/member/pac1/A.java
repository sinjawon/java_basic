package oop.modi.member.pac1;

public class A {
    //필드
   public int f1;
    int f2;
   private int f3;

   //생성자
    public A(int i){}
    A(double d){}
    private A(boolean b){}
   //메서드
    public void m1(){}
    void m2(){}
    private void m3(){}

   //퍼블릭
    void test1(){
        this.f1 = 10;
        this.f2 = 20;
        this.f3 = 30;

        new A(10);
        new A(3.14);
        new A(true);

        this.m1();
        this.m2();
        this.m3();
    }
    void test2(){}

}
