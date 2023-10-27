package baitap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import driver.driverFactory;
import model.pages.ComparePage;
import model.pages.MobilePage;

public class TC04 {
    @Test
    public void testAddCompare() {
        WebDriver driver = driverFactory.getChromeDriver();
        try {
            driver.get("http://live.techpanda.org/");

            MobilePage mobilePage = new MobilePage(driver);
            ComparePage comparePage = new ComparePage(driver);

            // Click on MOBILE menu
            driver.findElement(By.linkText("MOBILE")).click();

            // Add SonyXperia to compare
            mobilePage.addToCompareSonyXperia();

            // Add Iphone to compare
            mobilePage.addToCompareIphone();

            // Click on Compare and check the product
            mobilePage.clickCompareButton();
            String heading = "COMPARE PRODUCTS";
            String product1 = "SONY XPERIA";
            String product2 = "IPHONE";
            Assert.assertEquals(heading, comparePage.getHeadingText());
            Assert.assertEquals(product1, comparePage.getSonyXperiaCompare());
            Assert.assertEquals(product2, comparePage.getIphoneCompare());

        } catch (Exception e) {
            e.printStackTrace();
        }
        driver.quit();
    }
}
