package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    WebDriver driver;
    public LoginPage(WebDriver driver){
        this.driver = driver;
    }
    public void inputMail(String email){
        driver.findElement(By.xpath("//input[@id='Email']")).sendKeys(email);
    }
    public void inputPass(String pass){
        driver.findElement(By.xpath("//input[@id='AccountPassword']")).sendKeys(pass);
    }
    public void loginButton(){
        driver.findElement(By.xpath("//button[text()='Sign in']")).click();
    }
}
