package scripts;

import org.junit.jupiter.api.Test;
import pages.AuthPage;

public class Login extends BaseTest{


    public void logIn(){
        AuthPage loginPage = new AuthPage(page);
        loginPage.linkLogin();
        loginPage.inputMail("test01@gmail.com");
        loginPage.inputPass("123456");
        loginPage.loginButton();
    }
    @Test
    public void checkValidation(){
        AuthPage loginPage = new AuthPage(page);
        loginPage.linkLogin();
        loginPage.inputMail("");
        loginPage.inputPass("");
        loginPage.loginButton();
        loginPage.checkValidationEmpty();
    }

}
