package model.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OrderPage {
    private WebDriver driver;

    private By viewOrder = By.xpath("//tr[@class='first odd']//a[contains(text(),'View Order')]");
    private By printOrder = By.xpath("//body[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/a[2]");
    public OrderPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickViewOrder() throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(viewOrder).click();
    }

    public void clickPrintOrder() throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(printOrder).click();
    }
}
