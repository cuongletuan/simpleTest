package pages;

import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.options.AriaRole;

import static org.testng.AssertJUnit.assertEquals;

public class AuthPage {
    private Page page;

    public AuthPage(Page page){
        this.page = page;
    }
    public void linkLogin(){
        page.locator("ul.links li").nth(3).click();
    }
    public void linkSignUp(){
        page.getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName("Register Now")).click();
    }
    public void inputMail(String email){
        page.locator("input[type='text'][id='email']").fill(email);
    }
    public void inputPass(String pass){
        page.locator("input[type='password'][id='password']").fill(pass);
    }
    public void loginButton(){
        page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("LOG IN")).click();
    }
    public void checkValidationEmpty(){
        Locator checkEmpty = page.getByText("Specify the \"email\" value.");
        String actualError = checkEmpty.innerText();
        assertEquals("Specify the \"email\" value.", actualError.trim(), "Validation message mismatch!");
    }
}
