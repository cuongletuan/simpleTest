package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
    WebDriver driver;
    public LoginPage(WebDriver driver){
        this.driver = driver;
    }
    public void inputMail(String email){
        driver.findElement(By.xpath("//input[@id='']")).sendKeys(email);
    }
    public void inputPass(String pass){
        driver.findElement(By.xpath("//input[@id='AccountPassword']")).sendKeys(pass);
    }
    public void loginButton(){
        driver.findElement(By.xpath("//button[text()='Sign in']")).click();
    }
    public void checkValidationEmailEmpty(){
        WebElement checkEmpty = driver.findElement(By.xpath("//label[text()='Email']//following::div[@class='error'][1]"));
        String actualError = checkEmpty.getText();
        String expectedError = "The Email Address field is required";
        if (actualError.equals(expectedError)) {
            System.out.println("Email Address field is required");
        } else {
            System.out.println("Validation failed. Found: " + actualError);
        }
    }
    public void checkValidationPassEmpty(){
        WebElement checkEmpty = driver.findElement(By.xpath("//label[text()='Account Password']//following::div[@class='error'][1]"));
        String actualError = checkEmpty.getText();
        String expectedError = "The Password field is required";
        if (actualError.equals(expectedError)) {
            System.out.println("Password Address field is required");
        } else {
            System.out.println("Validation failed. Found: " + actualError);
        }
    }
}
