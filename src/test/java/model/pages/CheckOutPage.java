package model.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckOutPage {
    private WebDriver driver;
    private By checkOut = By.xpath("//button[@title='Proceed to Checkout']");
    private By selectBilling = By.xpath("//select//option[2]");
    private By firstName = By.id("billing:firstname");
    private By lastName = By.id("billing:lastname");
    private By address = By.id("billing:street1");
    private By city = By.id("billing:city");
    private By zip = By.id("billing:postcode");
   
    private By telephone = By.id("billing:telephone");
    private By btnContinue = By.xpath("//button[@title='Continue']");
    private By continueShip = By.xpath("//*[@id='shipping-method-buttons-container']/button");
    private By paymentMethod = By.id("p_method_checkmo");
    private By paymentCon = By.xpath("//body/div[1]/div[1]/div[2]/div[1]/div[1]/ol[1]/li[4]/div[2]/div[2]/button[1]");
    private By placeOrder = By.xpath("//button[@title='Place Order']");
    private By order = By.xpath("//h1[contains(text(),'Your order has been received.')]");

    public CheckOutPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickCheckOut() {
        driver.findElement(checkOut).click();
    }

    public void enterBilling(String fName, String lName, String addr, String City, String Zip, String phone) {
        driver.findElement(selectBilling).click();
        driver.findElement(firstName).clear();
        driver.findElement(firstName).sendKeys(fName);
        driver.findElement(lastName).clear();
        driver.findElement(lastName).sendKeys(lName);
        driver.findElement(address).clear();
        driver.findElement(address).sendKeys(addr);
        driver.findElement(city).clear();
        driver.findElement(city).sendKeys(City);
        driver.findElement(zip).clear();
        driver.findElement(zip).sendKeys(Zip);
        // driver.findElement(country).click();
        driver.findElement(telephone).clear();
        driver.findElement(telephone).sendKeys(phone);
        driver.findElement(btnContinue).click();
    }

    public void clickConBill() {
        driver.findElement(btnContinue).click();
    }

    public void clickShipMethod() throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(continueShip).click();
    }

    public void clickPayment() throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(paymentMethod).click();
        Thread.sleep(2000);
        driver.findElement(paymentCon).click();
    }

    public void clickPlaceOrder() throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(placeOrder).click();
    }

    public String getTextOrder() {
        return driver.findElement(order).getText();
    }

}
