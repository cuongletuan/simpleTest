package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SignUpPage {

    WebDriver driver;
    public SignUpPage(WebDriver driver){
        this.driver = driver;
    }
    public void linkSignUp(){
        driver.findElement(By.xpath("//span[text()='Create an account']")).click();
    }
    public void inputEmail(String email){
        driver.findElement(By.xpath("//input[@id='Email']")).sendKeys(email);
    }
    public void inputPass(String pass){
        driver.findElement(By.xpath("//input[@id='Password']")).sendKeys(pass);
    }
    public void inputReferral(String Referral){
        driver.findElement(By.xpath("//input[@id='ReferralCode']")).sendKeys(Referral);
    }
    public void createButton(){
        driver.findElement(By.xpath("//button[text()='Create Account']")).click();
    }
}
