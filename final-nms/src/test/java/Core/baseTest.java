package Core;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;

public class baseTest {
    public WebDriver driver;

    @BeforeMethod
    public void setup() {
        driver = new ChromeDriver();
        ExcelUtils.writeHeadingExcelFile("Report");
        String url = "http://demo-acm-2.bird.eu/admin";
        driver.get(url);
    }

    @AfterMethod
    public void teardown() {
        ExcelUtils.writeDataToExcelFile("src/Source/TestResult");
        driver.close();
    }
}
