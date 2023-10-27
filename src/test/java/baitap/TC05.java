package baitap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import driver.driverFactory;
import model.pages.CreateAccount;

public class TC05 {
    @Test
    public void testShareWishlist() {
        WebDriver driver = driverFactory.getChromeDriver();
        CreateAccount account = new CreateAccount(driver);

        try {
            driver.get("http://live.techpanda.org/");

            // Click on my account
            driver.findElement(By.linkText("MY ACCOUNT")).click();

            // Click on button Create Account
            account.clickCreateAccount();

            //input fields
            account.inputData("Thuy Tien", "Le Ngoc", "adadasdasdn@gmail.com", "123456", "123456");

            //Click on Register
            account.clickRegister();

            //Click on TV menu
            account.clickTVMenu();

            //Add the LG LCD to Wishlist
            account.clickAddToWishlist();

            //Click share wishlist 1
            account.clickShareWishlist();

            //Enter Email and message
            account.inputShare("tienn@gmail.com", "Send you");

            //Click Share wishlist 2
            account.clickShareWishlist2();

            //Check successfully
            String message = "Your Wishlist has been shared.";
            Assert.assertEquals(message, account.getNotification());

        } catch (Exception e) {
            e.printStackTrace();
        }
        driver.quit();
    }
}
