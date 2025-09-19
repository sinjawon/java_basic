package basic.loop;

public class WhileExample {
    public static void main(String[] args) {
        //복사단충 컨트롤 d
        //반복문 3요소 (begin -end -step)

        int i = 1; // 시작값
        while(i <= 10){
            System.out.println("하이");
            
            i++;
        }

        for(int j = 0; j < 10; j++){
            System.out.println("안녕포");
        }
        System.out.println("================================================");
        //특정값이 소수인지 아닌지
       int num = 23;
      int k = 1;
      int count = 0;
        while(k <= num){

           if(num % k == 0 ){
               count++;
           }
           k++;
        }
        if(count == 2){
            System.out.println("소수다");
        }else {
            System.out.println("소수가 아니다");
        }

    }
}
