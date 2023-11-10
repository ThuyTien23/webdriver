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


    private By addIphoneToCart = By.xpath("//body[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[3]/ul[1]/li[1]/div[1]/div[3]/button[1]/span[1]/span[1]");
    private By cost1 = By.xpath("//td[@class='product-cart-price']//span[@class='price']");
    private By couponCode = By.id("coupon_code");
    private By applyBtn = By.xpath("//button[@title='Apply']");
    private By cost2 = By.xpath("//strong//span[@class='price']");
   

    public CartPage(WebDriver driver) {
        this.driver = driver;
    }

    public String getCartMessage() {
        return driver.findElement(cartMessage).getText();
    }

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

     public void clickAddIphoneToCart() {
        driver.findElement(addIphoneToCart).click();
    }

    public void enterCouponCode(String code) {
        driver.findElement(couponCode).clear();
        driver.findElement(couponCode).sendKeys(code);
        driver.findElement(applyBtn).click();
    }

    public String getCost1() {
        return driver.findElement(cost1).getText();
    }

    public String getCost2() {
       return driver.findElement(cost2).getText();
    }
}