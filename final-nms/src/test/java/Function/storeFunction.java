package Function;

import Core.basePage;
import Page.catalogPage;
import Page.storePage;
import org.openqa.selenium.WebDriver;

public class storeFunction extends basePage {
    public storeFunction(WebDriver driver) {
        super(driver);
    }
    commonFunction common_Function = new commonFunction(driver);
    storePage storePage = new storePage();

    public void store7(){
        common_Function.clickToElement(storePage.store);
        common_Function.clickToElement(storePage.product);
        common_Function.clickToElement(storePage.addNewAttributeBtn);
        common_Function.clickToElement(storePage.searchBtn);
        common_Function.clickToElement(storePage.resetFilter);
        common_Function.isdisplayed(storePage.productAttributeTable);
        common_Function.isdisplayed(storePage.productAttributeTable20rows);
    }
    public void store8(){
        common_Function.clickToElement(storePage.store);
        common_Function.clickToElement(storePage.product);
        common_Function.clickToElement(storePage.addNewAttributeBtn);
        common_Function.isdisplayed(storePage.defaultLabelText);
        common_Function.isdisplayed(storePage.catalogInputTypeForStoreOwnerCombobox);
        common_Function.isdisplayed(storePage.valuesRequiredCombobox);
    }

    public void store81() {
        common_Function.clickToElement(storePage.advancedAttributeProperties);
        common_Function.isdisplayed(storePage.attributeCode);
        common_Function.isdisplayed(storePage.scope);
        common_Function.isdisplayed(storePage.defaultValue);
        common_Function.isdisplayed(storePage.uniqueValue);
        common_Function.isdisplayed(storePage.inputValidationForStoreOwner);
        common_Function.isdisplayed(storePage.addToColumnOptions);
        common_Function.isdisplayed(storePage.useInFilterOptions);

    }


    public void store9() {
        common_Function.clickToElement(storePage.store);
        common_Function.clickToElement(storePage.product);
        common_Function.clickToElement(storePage.addNewAttributeBtn);
        common_Function.sendKeysEnter(storePage.defaultLabelText,"image");
        common_Function.clickToElement(storePage.catalogInputTypeForStoreOwnerCombobox);
        common_Function.isSelected(storePage.valuesRequiredCombobox);
        common_Function.isSelected(storePage.saveaddtribute);
        common_Function.isDisplayed(storePage.verifymessage,"You saved the product attribute.");

    }
    public void store10() {
        common_Function.clickToElement(storePage.store);
        common_Function.clickToElement(storePage.product);
        common_Function.sendKeysEnter(storePage.searchAttributeCode,"color");
        common_Function.clickToElement(storePage.rowOnly);
        common_Function.isDisplayed(storePage.verifyDefaultLabel,"color");
    }
}
