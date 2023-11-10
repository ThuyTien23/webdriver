package baitap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import driver.driverFactory;
import model.pages.CartPage;
import model.pages.CheckOutPage;
import model.pages.LoginPage;
import model.pages.MobilePage;
import model.pages.ReOrderPage;

public class TC08 {
    @Test
    public void testReOrder() {
        WebDriver driver = driverFactory.getChromeDriver();
        LoginPage loginPage = new LoginPage(driver);
        ReOrderPage reorderPage = new ReOrderPage(driver);
        MobilePage mobilePage = new MobilePage(driver);
        CartPage cartPage = new CartPage(driver);
        CheckOutPage checkOutPage = new CheckOutPage(driver);
        

        try {
            driver.get("http://live.techpanda.org/");

            // Click on my account
            driver.findElement(By.linkText("MY ACCOUNT")).click();

            // login
            loginPage.login("min@gmail.com", "123456");

            reorderPage.clickReOrder();
            mobilePage.updateQuantity("10");

            //Enter ESTIMATE SHIPPING AND TAX
            cartPage.enterInfo("Ho Chi Minh", "1234");
            cartPage.getFixed();
            cartPage.clickFixed();
            cartPage.clickUpdateTotal();
            
            checkOutPage.clickCheckOut();
            checkOutPage.clickConBill();
            checkOutPage.clickShipMethod();
            checkOutPage.clickPayment();
            checkOutPage.clickPlaceOrder();

        } catch (Exception e) {
            e.printStackTrace();
        }
        driver.quit();
    }

}
