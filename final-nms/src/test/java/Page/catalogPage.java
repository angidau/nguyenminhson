package Page;

import org.openqa.selenium.By;

public class catalogPage {

    public By catalog = By.xpath("//nav[@class='admin__menu']/ul/li[2]/a");
    public By product = By.xpath("//span[contains(text(),'Products')]");
    public By searchKey = By.xpath("//*[@class='admin__data-grid-outer-wrap']/div/div/div/input");
    public By searchProduct = By.xpath("//div[contains(text(),'Joust Duffle Bag-Black')]");
    public By price = By.xpath("//div[contains(text(),'€45.00')]");
    public By attributeSet = By.xpath("//div[contains(text(),'Bag')]");
    public By productName = By.name("product[name]");
    public By edit = By.xpath("//tr[@class='data-row']/td[13]/a");
    public  By addproduct = By.xpath("//span[contains(text(),'Add Product')]");
    public By fillterBtn = By.xpath("//button[contains(text(),'Filters')]");
    public By newView = By.xpath("//*[@class='admin__data-grid-outer-wrap']/div/div[1]/div[1]/div[1]/button");
    public By columns = By.xpath("//*[@class='admin__data-grid-outer-wrap']/div/div/div/div[2]/button");
    public By tableListOutProduct = By.className("");
}
