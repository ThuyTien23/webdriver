package baitap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import driver.driverFactory;
import model.pages.MobilePage;

public class TC01 {
    @Test
    public void testSort() {
        WebDriver driver = driverFactory.getChromeDriver();
        try{
            driver.get("http://live.techpanda.org/");

            MobilePage mobilePage = new MobilePage(driver);
            

            // Click on MOBILE menu
            driver.findElement(By.linkText("MOBILE")).click();

            // Click on Sort by name
            mobilePage.SortByName();
            

        }catch(Exception e){
            e.printStackTrace();
        }
        driver.quit();
    }

}
