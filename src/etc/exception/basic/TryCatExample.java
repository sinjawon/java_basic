package etc.exception.basic;

public class TryCatExample {
    public static void main(String[] args) {
        try {
            //try 블록 예외 발생 가능성이 있는 코드 배치
            int i = 20, j = 0;

            System.out.printf("%d/%d = %d\n", i, j,i/j);

        }catch (Exception e) {
            //예외는ArithmeticException 이건데
            // 왜 Exception 한거냐
            //Exception이 부모 다
            //거의모든건  Exception
            //예외 발생 catch 블록 try에서 실제 예외가 발생했을경우
            //실행할 내용을 작성
            System.out.println("0으로 나누면 어떡하냐.");
        }

        System.out.println("프로그램종료");
    }

}
