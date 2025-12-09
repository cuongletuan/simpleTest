package scripts;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import pages.LoginPage;

public class LoginTest extends BaseTest{

    @Test
    public void testLogIn(){

        LoginPage loginPage = new LoginPage(driver);
        loginPage.inputMail("cuonglt@blockchainlabs.asia");
        loginPage.inputPass("Pass@@123BCA181");
        loginPage.loginButton();
    }
    @Test
    public void testCcheckValidation(){
        LoginPage loginPage = new LoginPage(driver);
        loginPage.inputMail("");
        loginPage.inputPass("");
        loginPage.loginButton();
        loginPage.checkValidationEmailEmpty();
        loginPage.checkValidationPassEmpty();
    }

    @Test
    public void sanityTest() {
        assert true;
    }

    @Test
    public void failTest() {
        org.testng.Assert.fail("Fail by design");
    }

    @AfterMethod
    public void quit(){
        driver.quit();
    }
}
