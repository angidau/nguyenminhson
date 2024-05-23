package Function;

import Core.basePage;
import Page.login_Pages;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class case1_Function extends basePage {
    public case1_Function(WebDriver driver) {
        super(driver);
    }
    commonFunctions common_Function = new commonFunctions(driver);
    login_Pages loginPages = new login_Pages();
//
//    public void case1(){
//        common_Function.clickToElement(loginPages.userid);
//        common_Function.clickToElement(loginPages.password);
//        common_Function.clickToElement(loginPages.loginBtn);
//        common_Function.clickToElement(loginPages.changepassword);
//        common_Function.sendKeysEnter(loginPages.oldpassword,"zajenyq");
//        common_Function.sendKeysEnter(loginPages.newpassword,"1234");
//        common_Function.sendKeysEnter(loginPages.confirmpassword,"1234");
//        common_Function.clickToElement(loginPages.submit);
//
//        WebElement clickMe1 = driver.findElement(By.xpath("//input[@name='sub']"));
//        clickMe1.click();
//        Alert alert = driver.switchTo().alert();
//
//        //get text alert
//        String text1 = alert.getText();
//        System.out.println("Please fill all fields" + text1);
//
//        //accept alert
//        alert.accept();
//        clickMe1.click();
//        common_Function.clickToElement(loginPages.backloginscreen);
//        common_Function.clickToElement(loginPages.logout);
//        WebElement clickMe2 = driver.findElement(By.xpath("//a[contains(text(),'Log out')]"));
//        clickMe2.click();
//        Alert alert1 = driver.switchTo().alert();
//
//        //get text alert
//        String text2 = alert.getText();
//        System.out.println("You Have Succesfully Logged Out!!" + text2);
//
//        //accept alert
//        alert1.accept();
//        clickMe2.click();}
//    public void case2(String userid, String newpassword) {
//        common_Function.sendKeysEnter(loginPages.userid, "mngr571659");
//        common_Function.sendKeysEnter(loginPages.newpassword, "1234");
//        common_Function.clickToElement(loginPages.loginnewpassword);
//        common_Function.clickToElement(loginPages.logoutnewpassword);
//    }
//        public void case3(String userid, String newpassword) {
//        common_Function.sendKeysEnter(loginPages.userid, "mngr571659");
//        common_Function.sendKeysEnter(loginPages.newpassword, "1234");
//        common_Function.clickToElement(loginPages.loginnewpassword);
//        common_Function.clickToElement(loginPages.newcustomer);
//        common_Function.isdisplayed(loginPages.addnewcustomermess);
//        common_Function.sendKeysEnter(loginPages.CustomerName,"Son");
//        common_Function.clickToElement(loginPages.gender);
//        common_Function.sendKeysEnter(loginPages.DateofBirth,"19/02/2002");
//        common_Function.sendKeysEnter(loginPages.address,"PhuTho");
//        common_Function.sendKeysEnter(loginPages.city,"VietTri");
//        common_Function.sendKeysEnter(loginPages.state,"VietNam");
//        common_Function.sendKeysEnter(loginPages.zip,"290000");
//        common_Function.sendKeysEnter(loginPages.phone,"1234");
//        common_Function.sendKeysEnter(loginPages.email,"abc@gmail.com");
//        common_Function.sendKeysEnter(loginPages.pass1,"13469");
//        common_Function.clickToElement(loginPages.submitnewcustomer);






        }









