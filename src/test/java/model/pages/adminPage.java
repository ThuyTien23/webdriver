package model.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class adminPage {
    private WebDriver driver;
    private By enterUser = By.id("username");
    private By enterPass = By.id("login");
    private By btnLogin = By.xpath("//body[1]/div[1]/div[1]/form[1]/div[1]/div[5]/input[1]");
    private By btnClose = By.xpath("//body[1]/div[1]/div[5]/div[1]/a[1]/span[1]");
    private By sale = By.xpath("//ul[@id='nav']/li[1]");
    private By order = By.xpath("//ul[@id='nav']/li[1]/ul[1]/li[1]");
    By OrderId = By.xpath("//input[@id='sales_order_grid_filter_real_order_id']");
    By FromDate = new By.ByName("created_at[from]");
    By ToDate = new By.ByName("created_at[to]");

    By SearchBtn = By.xpath("//span[contains(text(),'Search')]");

    public adminPage(WebDriver driver) {
        this.driver = driver;
    }

    public void login(String username, String password) {
        driver.findElement(enterUser).sendKeys(username);
        driver.findElement(enterPass).sendKeys(password);
        driver.findElement(btnLogin).click();
    }

    public void clickClose() {
        driver.findElement(btnClose).click();
    }

    public void clickOrder() throws InterruptedException {
        driver.findElement(sale).click();
        driver.findElement(order).click();
        Thread.sleep(2000);
    }

     public void enterOrderId(String orderID){
        WebElement orderIdEle = driver.findElement(OrderId);
        orderIdEle.clear();
        orderIdEle.sendKeys(orderID);
    }

    public void enterFromDate(String fromDate){
        WebElement fromDateEle = driver.findElement(FromDate);
        fromDateEle.clear();
        fromDateEle.sendKeys(fromDate);
    }

    public void entertToDate(String toDate){
        WebElement toDateEle = driver.findElement(ToDate);
        toDateEle.clear();
        toDateEle.sendKeys(toDate);
    }

    public void clickSearchBtn(){
        driver.findElement(SearchBtn).click();
    }

}
