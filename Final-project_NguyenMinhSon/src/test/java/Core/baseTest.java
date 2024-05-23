package Core;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class baseTest {
    public WebDriver driver;

    @BeforeMethod
    public void setup() {
        driver = new ChromeDriver();
        ExcelUtils.writeHeadingExcelFile("Report");
        String url = "https://demo.guru99.com/v4/index.php";
        driver.get(url);
    }

    @AfterMethod
    public void teardown() {
        ExcelUtils.writeDataToExcelFile("src/Source/TestResult");
        driver.close();
    }
}
