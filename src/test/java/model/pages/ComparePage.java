package model.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ComparePage {
    private WebDriver driver;
    private By headingText = By.xpath("//h1[normalize-space()='COMPARE PRODUCTS']");
    private By SonyXperiaCompared = By.xpath("//td[1]//h2[normalize-space()='SONY XPERIA']");
    private By IphoneCompared = By.xpath("//td[2]//h2[normalize-space()='IPHONE']");
    
    public ComparePage(WebDriver driver) {
        this.driver = driver;
    }

    public String getHeadingText() {
        return driver.findElement(headingText).getText();
    }

    public String getSonyXperiaCompare() {
        return driver.findElement(SonyXperiaCompared).getText();
    }

     public String getIphoneCompare() {
        return driver.findElement(IphoneCompared).getText();
    }
}
