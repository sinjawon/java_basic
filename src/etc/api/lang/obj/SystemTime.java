package etc.api.lang.obj;

public class SystemTime {
    public static void main(String[] args) {

        long start = System.currentTimeMillis();
        //1970년 1월1일  부터 지금까지 밀리초로 한건다 (초*1000)단위
        //프로그램시각 종료시각 걸린시간 원리로 
        
        int total = 0;
        for (int i = 0; i < 20000000; i++) {
            total += i;
        }
        long end = System.currentTimeMillis();

        System.out.println("(end -start) * 0.001 +\"초\" = " + (end -start) * 0.001 +"초");

        System.out.println(System.getProperties());
    }
}
