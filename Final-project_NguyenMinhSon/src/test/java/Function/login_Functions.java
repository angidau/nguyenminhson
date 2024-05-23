package Function;

import Core.basePage;
import Page.case1Page;
import Page.login_Pages;
import org.openqa.selenium.WebDriver;

public class login_Functions extends basePage {

    public login_Functions(WebDriver driver) {
        super(driver);
    }

    commonFunctions commonFunction = new commonFunctions(driver);
    login_Pages loginPage = new login_Pages();
    case1Page case1Page = new case1Page();

    public void login(String userid, String password, String newpass, String confirm)  {
        commonFunction.sendKeys(loginPage.userid, userid);
        commonFunction.sendKeys(loginPage.password, password);
        commonFunction.clickToElement(loginPage.loginBtn);
        commonFunction.isdisplayed(case1Page.Checktitle);
        commonFunction.clickToElement(case1Page.changePassword);
        commonFunction.isdisplayed(case1Page.checkchangePassword);
        commonFunction.sendKeys(case1Page.OldPassword, password);
        commonFunction.sendKeys(case1Page.NewPassword, newpass);
        commonFunction.sendKeys(case1Page.ConfirmPassword, confirm);
        commonFunction.clickToElement(case1Page.submit);
        commonFunction.alert();
        commonFunction.sendKeys(loginPage.userid, newpass);
        commonFunction.sendKeys(loginPage.password, confirm);
        commonFunction.clickToElement(loginPage.loginBtn);
        commonFunction.clickToElement(case1Page.logout);
    }

    public void NewCustomer(String userid, String password, String CustomerName,String DateofBirth,String Address, String City, String State, String Zip, String MobileNumber, String email,String pass, String check) {
        commonFunction.sendKeys(loginPage.userid, userid);
        commonFunction.sendKeys(loginPage.password, password);
        commonFunction.clickToElement(loginPage.loginBtn);
        commonFunction.clickToElement(case1Page.newCustomer);
        commonFunction.sendKeys(case1Page.CustomerName, CustomerName);
        commonFunction.clickToElement(case1Page.gender);
        commonFunction.sendKeys(case1Page.DateofBirth, DateofBirth);
        commonFunction.sendKeys(case1Page.Address, Address);
        commonFunction.sendKeys(case1Page.City, City);
        commonFunction.sendKeys(case1Page.State, State);
        commonFunction.sendKeys(case1Page.Zip, Zip);
        commonFunction.sendKeys(case1Page.MobileNumber, MobileNumber);
        commonFunction.sendKeys(case1Page.email, email);
        commonFunction.sendKeys(case1Page.pass, pass);
        commonFunction.isdisplayed(case1Page.submitbtn);
        commonFunction.clickToElement(case1Page.submitbtn);
        commonFunction.checkText(case1Page.Check,check);
        commonFunction.clickToElement(case1Page.logout);

    }




}
