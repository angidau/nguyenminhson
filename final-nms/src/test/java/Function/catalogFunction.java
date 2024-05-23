package Function;

import Core.basePage;
import Page.catalogPage;
import org.openqa.selenium.WebDriver;

public class catalogFunction extends basePage {
    public catalogFunction(WebDriver driver) {
        super(driver);
    }
    commonFunction common_Function = new commonFunction(driver);
    catalogPage catalog_Page = new catalogPage();

    public void catalog() {
        common_Function.clickToElement(catalog_Page.catalog);
        common_Function.clickToElement(catalog_Page.product);
    }

    public void searchKey() {
        common_Function.clickToElement(catalog_Page.searchKey);
        common_Function.sendKeysEnter(catalog_Page.searchKey, "Joust Duffle Bag-Black");
        common_Function.isDisplayed(catalog_Page.searchProduct, "Joust Duffle Bag-Black");
    }
        public void searchKey1() {
        common_Function.clickToElement(catalog_Page.searchKey);
        common_Function.sendKeysEnter(catalog_Page.searchKey, "Joust Duffle Bag-Black");
        common_Function.isDisplayed(catalog_Page.searchProduct, "Joust Duffle Bag-Black");
        common_Function.sendKeysEnter(catalog_Page.price,"€34.00");
        common_Function.isDisplayed(catalog_Page.searchProduct, "€34.00");
        common_Function.sendKeysEnter(catalog_Page.attributeSet,"Bag");
        common_Function.isDisplayed(catalog_Page.searchProduct, "Bag");


    }
    public void case4(){
        common_Function.clickToElement(catalog_Page.catalog);
        common_Function.clickToElement(catalog_Page.product);
        common_Function.clickToElement(catalog_Page.addproduct);
        common_Function.sendKeysEnter(catalog_Page.searchKey,"Joust Duffle Bag");
        common_Function.isdisplayed(catalog_Page.fillterBtn);
        common_Function.isdisplayed(catalog_Page.newView);
        common_Function.isdisplayed(catalog_Page.columns);
        common_Function.isdisplayed(catalog_Page.tableListOutProduct);
    }

}
