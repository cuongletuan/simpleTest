package pages;

import com.microsoft.playwright.Page;
import com.microsoft.playwright.options.AriaRole;

public class LoginPage {
    private Page page;

    public LoginPage(Page page){
        this.page = page;
    }
    public void linkLogin(){
        page.locator("ul.links li").nth(3).click();
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
    public void checkValidationEmailEmpty(){

    }
    public void checkValidationPassEmpty(){

    }
}
