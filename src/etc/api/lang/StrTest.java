package etc.api.lang;

public class StrTest {

    public static void main(String[] args) {

        long start = System.currentTimeMillis();

        String str = "a";
        /*for (int i = 0; i < 5000000; i++) {
            str += "a";
        }*/


        StringBuilder sb = new StringBuilder("a");
        for (int i = 0; i < 500000; i++) {
            sb.append("a");
        }


        long end = System.currentTimeMillis();

        System.out.println("실행 결과: " + (end - start) * 0.001 + "초");

        double pi = 3.141592;
        long result = Math.round(pi*1000);
        System.out.println("result = " + result*0.001);

        //쓸 일이 많으면 오버라이딩 하면될것같은데
        //내가 개쩔게 잘하면 만들어보자
       long result2 =  Math.round(3.14);
        System.out.println("result = " + result);

    }
}
