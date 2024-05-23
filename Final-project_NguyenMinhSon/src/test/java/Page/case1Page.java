package Page;

import org.openqa.selenium.By;

public class case1Page {
    public By Checktitle = By.tagName("h2");
    public By Check = By.xpath("//p[@class=\"heading3\"]");
    public By changePassword = By.xpath("//ul[@class=\"menusubnav\"]//li[11]/a");
    public By checkchangePassword = By.xpath("//p[@class=\"heading3\"]");
    public By OldPassword = By.name("oldpassword");
    public By NewPassword = By.name("newpassword");
    public By ConfirmPassword = By.name("confirmpassword");
    public By submit = By.xpath("//td//input[@type=\"submit\"]");
    public By logout = By.xpath("//ul[@class=\"menusubnav\"]//li[15]/a");

    public By newCustomer = By.xpath("//ul[@class=\"menusubnav\"]//li[2]/a");

    public By CustomerName = By.name("name");
    public By gender = By.xpath("//input[@type= 'radio' and @value='m']");
    public By DateofBirth = By.xpath("//input[@id=\"dob\"]");
    public By Address = By.name("addr");
    public By City = By.name("city");
    public By State = By.name("state");
    public By Zip = By.name("pinno");
    public By MobileNumber = By.name("telephoneno");
    public By email = By.name("emailid");
    public By pass = By.name("password");
    public By submitbtn = By.name("sub");



}
