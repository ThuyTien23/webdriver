package baitap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import driver.driverFactory;
import model.pages.LoginPage;
import model.pages.OrderPage;

public class TC07 {
    @Test
    public void TestOrder() {
        WebDriver driver = driverFactory.getChromeDriver();
        LoginPage loginPage = new LoginPage(driver);
        OrderPage orderPage = new OrderPage(driver);

        try {
            driver.get("http://live.techpanda.org/");

            // Click on my account
            driver.findElement(By.linkText("MY ACCOUNT")).click();
        
            // login
            loginPage.login("min@gmail.com", "123456");

            //my orders
            driver.findElement(By.linkText("MY ORDERS")).click();            
            orderPage.clickViewOrder();
            orderPage.clickPrintOrder();        

            WebElement saveAsPdfLink = driver.findElement(By.linkText("Save as PDF"));
            saveAsPdfLink.click();

        } catch (Exception e) {
            e.printStackTrace();
        }
        driver.quit();
    }
}
