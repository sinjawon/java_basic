package basic.constate;
 //좌측에 커밋이 있다 깃에 해보자
public class IfExample2 {
    public static void main(String[] args) {
        int age = 15;
        if (age >= 20) {
              if (age < 40) {
                  System.out.println("넌 청년이다");
              } else if (age <64) {
                  System.out.println("장년층 이다");
              }else{
                  System.out.println("노년층이다");
              }
        }else if(age >= 17) {
            System.out.println("고딩이다");
        }else  if(age >= 14) {
            System.out.println("중딩이다");
        } else if (age >= 8) {
            System.out.println("미취학 아동이다.");
        }
    }
}
