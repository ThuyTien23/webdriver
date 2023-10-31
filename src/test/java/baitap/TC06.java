package baitap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import driver.driverFactory;
import model.pages.CartPage;
import model.pages.CheckOutPage;
import model.pages.LoginPage;


public class TC06 {
    @Test
    public void testPurchaseProduct() {
        WebDriver driver = driverFactory.getChromeDriver();
        LoginPage loginPage = new LoginPage(driver);
        CartPage cartPage = new CartPage(driver);
        CheckOutPage checkOutPage = new CheckOutPage(driver);

        try {
            driver.get("http://live.techpanda.org/");

            // Click on my account
            driver.findElement(By.linkText("MY ACCOUNT")).click();
        
            // login
            loginPage.login("min@gmail.com", "123456");

            // Click on My Wishlist
            driver.findElement(By.linkText("MY WISHLIST")).click();
            
            cartPage.clickAddToCart();

            //Enter ESTIMATE SHIPPING AND TAX
            cartPage.enterInfo("Ho Chi Minh", "1234");
            cartPage.getFixed();
            cartPage.clickFixed();
            cartPage.clickUpdateTotal();
            // Assert.assertEquals(cartPage.getFixed(), cartPage.checkFixed());

            //Click on the CheckOut button
            checkOutPage.clickCheckOut();
            checkOutPage.enterBilling("Tien", "Le", "Linh Trung", "Thu Duc", "1234", "0325478964");
            checkOutPage.clickShipMethod();
            checkOutPage.clickPayment();
            checkOutPage.clickPlaceOrder();
            String mess = "YOUR ORDER HAS BEEN RECEIVED.";
            Assert.assertEquals(checkOutPage.getTextOrder(), mess);

        } catch (Exception e) {
            e.printStackTrace();
        }
        driver.quit();
    }
}
