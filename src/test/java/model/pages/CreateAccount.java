package model.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CreateAccount {
    WebDriver driver;

    private By buttonCreate = By.xpath("//a[@title='Create an Account']");
    private By firstName = By.id("firstname");
    private By lastName = By.id("lastname");
    private By email = By.id("email_address");
    private By pass = By.id("password");
    private By confirPass = By.id("confirmation");
    private By register = By.xpath("//body/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/div[2]/button[1]");
    private By TV = By.linkText("TV");
    private By wishlist = By.xpath("//body/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/ul[1]/li[1]/div[1]/div[3]/ul[1]/li[1]/a[1]");
    private By shareWishlist = By.xpath("//button[@title='Share Wishlist']");
    private By emailShare = By.id("email_address");
    private By messageShare = By.id("message");
    private By share = By.xpath("//span[contains(text(),'Share Wishlist')]");
    private By noti = By.xpath("//span[contains(text(),'Your Wishlist has been shared.')]");

    public CreateAccount(WebDriver driver) {
        this.driver = driver;
    }

    public void clickCreateAccount() {
        driver.findElement(buttonCreate).click();
    }

    public void inputData(String firstname, String lastname, String Email, String password, String confirpass) {        
        driver.findElement(firstName).sendKeys(firstname);
        driver.findElement(lastName).sendKeys(lastname);
        driver.findElement(email).sendKeys(Email);        
        driver.findElement(pass).sendKeys(password);
        driver.findElement(confirPass).sendKeys(confirpass);
    }

    public void clickRegister() {
        driver.findElement(register).click();
    }

    public void clickTVMenu() {
        driver.findElement(TV).click();
    }

    public void clickAddToWishlist() {
        driver.findElement(wishlist).click();
    }

    public void clickShareWishlist() {
        driver.findElement(shareWishlist).click();
    }

    public void inputShare(String email, String message) {
        driver.findElement(emailShare).sendKeys(email);
        driver.findElement(messageShare).sendKeys(message);
    }

    public void clickShareWishlist2() {
        driver.findElement(share).click();
    }

    public String getNotification() {
        return driver.findElement(noti).getText();
    }
}
