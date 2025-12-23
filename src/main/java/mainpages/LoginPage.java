package mainpages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    private WebDriver driver;
    private By userNameField = By.xpath("//input[@placeholder='Username']");
    private By passwordField = By.xpath("//input[@placeholder='Password']");
    private By loginButton = By.xpath("//input[@data-test='login-button']");

    public LoginPage(WebDriver driver){
        this.driver = driver;
    }
    public void enterUsername(String username){
        driver.findElement(userNameField).sendKeys(username);
    }
    public void enterPassword(String password){
        driver.findElement(passwordField).sendKeys(password);
    }
    public void clickOnLoginButton(){
        driver.findElement(loginButton).click();
    }
}
