package Function;

import Core.basePage;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import java.util.ArrayList;
import java.util.Set;

public class commonFunction extends basePage {
    public commonFunction(WebDriver driver){
        super(driver);
    }

    public void clickToElement(By locator){
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(locator));
        element.click();
    }
    public void click(By locator){
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
        element.click();
    }
    public void refresh(){
        driver.navigate().refresh();
    }

    public void sendKeys(By locator, String value){
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
        element.clear();
        element.sendKeys(value);
    }
    public void sendKeysEnter(By locator, String value){
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
        element.clear();
        element.sendKeys(value, Keys.ENTER);
    }

    public void isdisplayed(By locator){
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
        Assert.assertTrue(element.isDisplayed());
    }
    public void isDisplayed(By locator,String value){
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
        Assert.assertTrue(element.isDisplayed());
        String a = element.getText();
        Assert.assertEquals(a, value);
    }
    public void isSelected(By locator){
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
        Assert.assertFalse(element.isSelected());
    }

    public void checkText(By locator, String value){
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
        String a = element.getText();
        Assert.assertEquals(a, value);
    }
    public void verifyTitle(String title) {
        Assert.assertEquals(driver.getTitle(), title);
    }


    public void getCookie(){
        Cookie cookie1 = driver.manage().getCookieNamed("store");
        Set<Cookie> list = driver.manage().getCookies();
        for(Cookie cookie : list){
            System.out.println(cookie);

        }
    }


    public void selectByVisibleText(By locator, String text){
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
        element.click();
        Select select = new Select(element);
        select.selectByVisibleText(text);
    }
    public void selectLocator(By locator, int index){
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
        element.click();
        Select select = new Select(element);
        select.selectByIndex(index);
    }
    public void switchToWindowByIndex(int index) {
        ArrayList<String> window = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(window.get(1));
    }

    public void switchToWindowByTitle(String title) {
        for (String windowID : driver.getWindowHandles()) {
            String getTitle = driver.switchTo().window(windowID).getTitle();
            if (getTitle.equals("Selenium Easy - Window popup Modal Demo)")) {
                driver.switchTo().window(windowID);
                break;
            }
        }
    }


}
