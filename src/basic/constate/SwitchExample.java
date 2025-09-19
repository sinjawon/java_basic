package basic.constate;

public class SwitchExample {
    public static void main(String[] args) {
        String gender = "k";
        //구분해야 할 값이 많을 떄
        //명확하게 떨어지는 값이 많을때
        //값의 기준이 들어간다
        //분기를 나눌 기준값이 괄호안에 들어감 / (문자열 ,정수만 가능)
        switch(gender) {
            //케이스 콤마 나열
            //자바14버전 이상 해야한다 ㅣ히히히
            case "M", "m", "남" :
                System.out.println("남서입니다.");
              //코드가 흘러내리지않게
              //그치만 흘러내리지않게
                break;
            case "F", "f", "여":
                System.out.println("여성이빈다.");
                break;
            default:
                System.out.println("엄한걸 입력했네");
                break;

        }
    }
}
