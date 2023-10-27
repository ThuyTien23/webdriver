package model.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
public class MobilePage {
    private WebDriver driver;
     
    private By selectSort = By.xpath("//select//option[2]");

    private By costOfSony = By.id("product-price-1");
    private By detailSony = By.xpath("//li[2]//div[1]//h2");

    private By addToCartSonyXperiaButton = By.xpath("//li[2]//div[1]//div[3]//button[1]");
    private By qtyField = By.xpath("//input[@title='Qty']");
    private By updateButton = By.xpath("//button[@title='Update']//span//span[contains(text(),'Update')]");
    private By errorMessage = By.className("error-msg");
    private By emptyCartLink = By.xpath("//button[@title='Empty Cart']");

    private By addToCompareSonyXperiaLink = By.xpath("//li[2]//div[1]//div[3]//ul[1]//li[2]//a");
    private By addToCompareIphoneLink = By.xpath("//li[3]//div[1]//div[3]//ul[1]//li[2]//a");
    private By CompareButton = By.xpath("//button[@title='Compare']");
    
    
    
   
    public MobilePage(WebDriver driver) {
        this.driver = driver;
    }

    //sort By Name
    public void SortByName() {
        driver.findElement(selectSort).click();
        driver.findElement(By.xpath("//div[@class='sort-by']//a")).click();
    }

    //Compare cost of Sony
    public String getCostOfSony() {
        return driver.findElement(costOfSony).getText();
    }

    public void clickOnSony() {
        driver.findElement(detailSony).click();
    }


    //add To Cart
    public void addToCartSonyXperia() {
        driver.findElement(addToCartSonyXperiaButton).click();
    }

    public void updateQuantity(String quantity) {
        driver.findElement(qtyField).clear();
        driver.findElement(qtyField).sendKeys(quantity);
        driver.findElement(updateButton).click();
    }

    public String getErrorMessage() {
        return driver.findElement(errorMessage).getText();
    }

    public void clickEmptyCart() {
        driver.findElement(emptyCartLink).click();
    }
    

    //add To Compare
    public void addToCompareSonyXperia() {
        driver.findElement(addToCompareSonyXperiaLink).click();
    }

    public void addToCompareIphone() {
        driver.findElement(addToCompareIphoneLink).click();
    }

    public void clickCompareButton() {
        driver.findElement(CompareButton).click();
    }
}