package baitap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import driver.driverFactory;
import model.pages.MobilePage;
import model.pages.SonyDetailPage;

public class TC02 {
    @Test
    public void testSonyDetail() {
        WebDriver driver = driverFactory.getChromeDriver();
        try {
            driver.get("http://live.techpanda.org/");

            MobilePage mobilePage = new MobilePage(driver);            
            SonyDetailPage sdp = new SonyDetailPage(driver);

            // Click on MOBILE menu
            driver.findElement(By.linkText("MOBILE")).click();

            //Click on Sony
            mobilePage.clickOnSony();
            Assert.assertEquals(mobilePage.getCostOfSony(), sdp.getValueSony());

        } catch (Exception e) {
            e.printStackTrace();
        }
        driver.quit();
    }
}
