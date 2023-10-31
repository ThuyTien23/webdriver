package model.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    private WebDriver driver;
    private By email = By.id("email");
    private By password = By.id("pass");
    private By login = By.id("send2");

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public void login(String emailAdd, String pass) {
        driver.findElement(email).sendKeys(emailAdd);
        driver.findElement(password).sendKeys(pass);
        driver.findElement(login).click();
    }
}
