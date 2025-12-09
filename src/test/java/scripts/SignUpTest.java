package scripts;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import pages.SignUpPage;

public class SignUpTest extends BaseTest{

    @Test
    public void testSignUp() throws InterruptedException {
        SignUpPage signUpPage = new SignUpPage(driver);
        signUpPage.linkSignUp();
        Thread.sleep(3000);
        signUpPage.inputEmail("test01@gmail.com");
        signUpPage.inputPass("Pass@@123A181");
        signUpPage.inputReferral("");
        signUpPage.createButton();
    }

    @AfterMethod
    public void quit(){
        driver.quit();
    }
}
