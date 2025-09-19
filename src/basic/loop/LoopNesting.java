package basic.loop;

public class LoopNesting {
    public static void main(String[] args) {
        //30~100사이 소수가 몇개있는지 세어봐
      int scount = 0;
        for(int i=30;i<=100;i++){
            int count = 0;
            for(int j=1; j<= i ;j++){
                if(i%j ==0 ){
                    count++;
                }

            }
          if(count==2){
               scount++;
          }
        }
        //sout v하면 도니다
        System.out.println("scount = " + scount);
        System.out.println("소수의 갯수는" + scount + "개다");
    }
}
