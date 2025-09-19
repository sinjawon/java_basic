package basic.loop;

public class ContinueExample {
    public static void main(String[] args) {
        //contiue 해당건너뛴다
        for (int i=1; i<=10; i++) {
            // for문에서 continue는 증감식이 발동.
            if (i == 5) continue;
            System.out.print(i + " ");
        }
        System.out.println("\n반복문 종료!");

        System.out.println("=====================================");

        int n = 1;
        int count =0 ;
        while (n <= 10) {
            count++;
            System.out.println(count);
            if(count == 20) break;
            // while에서 continue는 조건식으로 흐름이 이동.
            if (n == 5) continue;
            System.out.print(n + " ");
            n++;
        }
        System.out.println("\n반복문 종료!");
    }
}
