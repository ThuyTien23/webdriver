package baitap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import driver.driverFactory;
import model.pages.CartPage;

public class TC09 {
    @Test
    public void testDiscount() {
        WebDriver driver = driverFactory.getChromeDriver();
        CartPage cartPage = new CartPage(driver);

        try {
            driver.get("http://live.techpanda.org/");

            // Click on MOBILE
            driver.findElement(By.linkText("MOBILE")).click();

            // Add Iphone to the cart
            cartPage.clickAddIphoneToCart();
            cartPage.getCost1();

            // Enter the discount code 
            cartPage.enterCouponCode("GURU50");

            // Verify the discount generated
            
            Assert.assertNotEquals(cartPage.getCost2(), cartPage.getCost1());
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        driver.quit();
    }
}
