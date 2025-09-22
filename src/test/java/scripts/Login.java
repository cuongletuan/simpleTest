package scripts;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import pages.LoginPage;

public class Login extends BaseTest{

    @Test
    public void logIn(){

        LoginPage loginPage = new LoginPage(driver);
        loginPage.inputMail("cuonglt@blockchainlabs.asia");
        loginPage.inputPass("Pass@@123BCA181");
        loginPage.loginButton();
    }

    @AfterMethod
    public void quit(){
        driver.quit();
    }
}
