package scripts;

import org.junit.jupiter.api.Test;
import pages.LoginPage;
import pages.SignUpPage;

public class SignUp extends BaseTest{

    @Test
    public void signUp(){
        LoginPage loginPage = new LoginPage(page);
        loginPage.linkLogin();
        loginPage.linkSignUp();
        SignUpPage signUp = new SignUpPage(page);
        signUp.inputFirst("Nguyen");
        signUp.inputLast("Van A");
        signUp.inputEmail("test02");
        signUp.inputPhone("090234568");
        signUp.inputPass("123456");
        signUp.inputConfirmPass("123456");
        signUp.checkInput();
        signUp.linkCreate();
    }
}
