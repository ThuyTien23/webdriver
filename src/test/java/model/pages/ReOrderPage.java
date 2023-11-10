package model.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ReOrderPage {
     private WebDriver driver;

    private By reOrder = By.xpath("//tr[@class='first odd']//a[contains(text(),'Reorder')]");
  

    public ReOrderPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickReOrder() throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(reOrder).click();
    }

    

    
}
