package etc.exception.custom;

//사용자 정의 예외 클래스 커스텀
//만드는방법 익샙션이나 상속을
//익스탡 ㅡ 익샙션 하면 try /catch 강제한다
//런터ㅏ임 하면 예외처리 강제하지 않는다
/*
* @ㅂㅇㄴㅇ낭
* */
public class LoginInvalidException extends RuntimeException {

    private String inputAccount;


    public LoginInvalidException(String message,String inputAccount) {
        //메세지를 받으면 부모에 받아 처리할수 있게
        super(message);
        this.inputAccount=inputAccount;
    }
    public String getInputAccount() {
        return inputAccount;
    }
}
