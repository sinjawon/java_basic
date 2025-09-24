package etc.api.lang.wrapper;

public class WrapperExample {
    public static void main(String[] args) {
        int a = 100 ;
        boolean b = false;
        char c = 'a';
        double d = 3.14;

        //boxing
        //도태된 문법 사라진사라질 문법이다
       //Integer v1 = new Integer(a);

        //요즘에 한거다
        //autoboxing 기본타입을 자동으로 객체형을 변환해준다
        Integer v1 = a; //<< 바로 넣는다 끝이다
        Boolean b1 = b;
        Character c1 = c;
        Double d1 = d;

        //unboxing :객체 타입을 포장된 값을 기본데이터 타입으로 변환.
        // int i = v1.intValue(); // 옛날문법이다
       int v2 = v1;
       double d2 =d1;



    }
}
