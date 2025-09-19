package basic.loop;

public class BreakExample {
    public static void main(String[] args) {
        //포문 간단히
        for (int i = 0; i < 10; i++) {
            //이프 포 와이드 블록 내의 코드가 한줄인경우 괄호 생략 가능하다
            if(i == 5) break;

            System.out.print(i + " ");

        }
        //문자열 안에 명령어 넣고 싶은 기호가 있다
        System.out.println("\n==============================================");
       outer: for (int i=0; i<=2; i++) { //적당한 이름을 붙이쟈
            for (int j=0; j<=i; j++) {
                //여기브레이크 타겟은 어디일까
                //포탈 명칭 라벨링으로하면 브레이크 통로 한번에 가능하다
                if(i==j) break outer;
                System.out.println(i + "-" + j);
            }
        }

    }
}
