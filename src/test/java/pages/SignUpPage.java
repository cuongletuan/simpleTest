package pages;

import com.microsoft.playwright.Page;
import com.microsoft.playwright.options.AriaRole;

public class SignUpPage {
    private Page page;

    public SignUpPage(Page page){
        this.page = page;
    }
    public void inputFirst(String name){
        page.locator("input[name='firstName']").fill(name);
    }
    public void inputLast(String name){
        page.locator("input[name='lastName']").fill(name);
    }
    public void inputPhone(String name){
        page.locator("input[name='phone']").fill(name);
    }
    public void inputEmail(String email){
        page.locator("input[name='email']").fill(email);
    }
    public void inputPass(String pass){
        page.locator("input[name='password']").fill(pass);
    }
    public void inputConfirmPass(String confirmPass){
        page.locator("input[name='passwordConfirmation']").fill(confirmPass);
    }
    public void checkInput(){
        page.locator("#subscribed").check();
    }
    public void linkCreate(){
        page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("REGISTER")).click();
    }
}
