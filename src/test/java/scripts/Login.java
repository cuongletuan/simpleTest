package scripts;

import org.junit.jupiter.api.Test;
import pages.LoginPage;

public class Login extends BaseTest{

    @Test
    public void logIn(){
        LoginPage loginPage = new LoginPage(page);
        loginPage.linkLogin();
        loginPage.inputMail("test01@gmail.com");
        loginPage.inputPass("123456");
        loginPage.loginButton();
    }
    @Test
    public void checkValidation(){
        LoginPage loginPage = new LoginPage(page);
        loginPage.linkLogin();
        loginPage.inputMail("");
        loginPage.inputPass("");
        loginPage.loginButton();
        loginPage.checkValidationEmpty();
    }

}
