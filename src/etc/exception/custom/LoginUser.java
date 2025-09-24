package etc.exception.custom;

//로그인 검증을 수행하는 클래스
public class LoginUser {
    private  String account;
    private String password;
    public LoginUser(String account, String password) {
        this.account = account;
        this.password = password;
    }
    /*
    *
    * */

    public String authenticate(String inputaccount, String inputPassword)
            throws  LoginInvalidException {

        if(!this.account.equals((inputaccount))){
            throw new LoginInvalidException("아이디가 틀렸다",inputaccount);
        }
        
        
        //같지않다면
        if(!this.account.equals((inputPassword))){
              throw new LoginInvalidException("비밀번호가 틀려씁니다",inputPassword);
        }
        System.out.println("로그인서옥ㅇ");
        return "로그인성공";

    }

}
