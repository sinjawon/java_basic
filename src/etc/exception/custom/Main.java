package etc.exception.custom;

public class Main {
    public static void main(String[] args) {
     LoginUser user =  new LoginUser("asd1234","123213");

    //    user.atuthenticate("asd1234","1111");
        String result = null;
        try {
            result = user.authenticate("asd1234","1111");
        } catch (LoginInvalidException e) {
            System.out.println(e.getMessage());
            System.out.println("입력값"+ e.getMessage());
        }
        System.out.println(result);
    }
}
