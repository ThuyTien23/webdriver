package model.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CartPage {
    private WebDriver driver;
    private By cartMessage = By.xpath("//h1[normalize-space()='Shopping Cart is Empty']");
    
    // private By wishlist = By.xpath("//strong[contains(text(),'My Wishlist')]");
    private By addToCart = By.xpath("//button[@title='Add to Cart']");
    private By selectCountry = By.xpath("//select[@id='country']//option[@value='VN']");
    private By enterState = By.id("region");
    private By enterZip = By.id("postcode");
    private By estimate = By.xpath("//button[@title='Estimate']");
    private By fixed = By.xpath("//body/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/form[2]/dl[1]/dd[1]/ul[1]/li[1]/label[1]");
    private By chooseFixed = By.id("s_method_flatrate_flatrate");
    private By total = By.xpath("//button[@title='Update Total']");
    private By checkFixed = By.xpath("//span[@class='price']");


    public CartPage(WebDriver driver) {
        this.driver = driver;
    }

    public String getCartMessage() {
        return driver.findElement(cartMessage).getText();
    }

    // public void clickWishList() {
    //     driver.findElement(wishlist).click();
    // }

    public void clickAddToCart() {
        driver.findElement(addToCart).click();
    }

    public void enterInfo(String state, String zip) {
        driver.findElement(selectCountry).click();
        driver.findElement(enterState).sendKeys(state);
        driver.findElement(enterZip).sendKeys(zip);
        driver.findElement(estimate).click();
    }

    //verify shipping cost
    public String getFixed() {
        return driver.findElement(fixed).getText();
    }

    public void clickFixed() {
        driver.findElement(chooseFixed).click();
    }

    public void clickUpdateTotal() {
        driver.findElement(total).click();
    }

    public String checkFixed() {
        return driver.findElement(checkFixed).getText();
    }
}