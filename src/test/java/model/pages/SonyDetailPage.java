package model.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SonyDetailPage {
    private WebDriver driver;
    private By valueSony = By.id("product-price-1");

    public SonyDetailPage(WebDriver driver) {
        this.driver = driver;
    }

    public String getValueSony() {
        return driver.findElement(valueSony).getText();
    }

}
