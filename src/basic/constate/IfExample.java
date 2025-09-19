package basic.constate;

public class IfExample {
    public static void main(String[] args) {
             //메인함수안에 해야 프로그램 실행이 가능하다
            //main 함수 템플릿을 선택해서 쉽게 작성 가능
        int score = 65;
        if (score >= 70) {
            System.out.println("70점 이상이다 합격이다");
        }else {
            //sout 출력 단축키
            System.out.println("그게 점수냐");
            System.out.println(" 미안하다 ");
        }
        System.out.println("시험치르면 고생많다");
    }

}
