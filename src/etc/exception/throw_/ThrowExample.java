package etc.exception.throw_;

public class ThrowExample {

    static  int calTotal(int end) throws Exception{
        if(end <= 0){

        
            throw new ArithmeticException("매값은양수로");
        }
        int total=0;
        for (int i=0; i <= end; i++){
            total+=i;
        }
        return total;
    }
    public static void main(String[] args) {

        int result = 0;
        try {
            result = calTotal(100);
            System.out.println("result = " + result);

            int result2 = calTotal(-120);
            System.out.println("resul2t = " + result2);

        } catch (Exception e) {
            System.out.println("캐치문실행");
        }
        System.out.println("프로그램정상종룐");

    }
}
