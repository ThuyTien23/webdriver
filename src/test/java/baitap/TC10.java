package baitap;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import driver.driverFactory;
import model.pages.adminPage;

public class TC10 {
    @Test
    public void testScreenshot() {
        WebDriver driver = driverFactory.getChromeDriver();      
        adminPage admin = new adminPage(driver);  

        try {
            driver.get("http://live.techpanda.org/index.php/backendlogin");

            //login
            admin.login("user01", "guru99com");
            admin.clickClose();
            admin.clickOrder();
            admin.enterOrderId("100020595");
            admin.enterFromDate("11/2/2023");
            admin.entertToDate("11/10/2023");
            admin.clickSearchBtn();
            Thread.sleep(2000);

            //Screenshot capture
            File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
            String png = ("D:\\Fall_2023\\SWT301\\Code\\WebDriver\\selenium-webdriver-java-master\\src\\test\\java\\baitap\\TC10.png");
            FileUtils.copyFile(scrFile, new File(png));

        }catch(Exception e){
            e.printStackTrace();
        }
        driver.quit();
    }

}
