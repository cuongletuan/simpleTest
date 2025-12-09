package scripts;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import pages.LoginPage;

public class LoginTest extends BaseTest{

    @Test
    public void logIn(){

        LoginPage loginPage = new LoginPage(driver);
        loginPage.inputMail("cuonglt@blockchainlabs.asia");
        loginPage.inputPass("Pass@@123BCA181");
        loginPage.loginButton();
    }
    @Test
    public void checkValidation(){
        LoginPage loginPage = new LoginPage(driver);
        loginPage.inputMail("");
        loginPage.inputPass("");
        loginPage.loginButton();
        loginPage.checkValidationEmailEmpty();
        loginPage.checkValidationPassEmpty();
    }

    @AfterMethod
    public void quit(){
        driver.quit();
    }
}
