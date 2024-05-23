package Test;

import Core.ExcelUtils;
import Core.baseTest;
import Function.case1_Function;
import Function.login_Functions;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class finalTest extends baseTest {
    @DataProvider()
    public static Object[][] getAccountData(){
        String path = "src/source/final.xlsx";
        String sheetName = "Sheet1";
        return ExcelUtils.getTableArray(path, sheetName,0, 4);
    }
    @DataProvider()
    public static Object[][] getInputData(){
        String path = "src/source/final.xlsx";
        String sheetName = "Sheet2";
        return ExcelUtils.getTableArray(path, sheetName,0, 12);
    }
    @Test(dataProvider = "getAccountData")
    public void tc01_ChangePass(String username, String password, String newpass, String confirm) {
        login_Functions login_function = new login_Functions(driver);
        try {
            login_function.login(username, password, newpass, confirm);
            ExcelUtils.writeData("2", "TCs_01", "TC_ChangePass", "Pass", "Pass");
        } catch (Exception e) {
            ExcelUtils.writeData("2", "TCs_01", "TC_ChangePass", "Pass", "Failed");
        }
         catch (AssertionError a) {
            ExcelUtils.writeData("2", "TCs_01", "tc01_ChangePass", "Pass", String.valueOf(a));
          }
    }

    @Test(dataProvider = "getInputData")
    public void tc02_CreateNewCustomer(String userid, String password, String CustomerName,String DateofBirth,String Address, String City, String State, String Zip, String MobileNumber, String email,String pass, String check) {
        login_Functions login_function = new login_Functions(driver);
        try {
            login_function.NewCustomer(userid,password,CustomerName,DateofBirth,Address,City,State,Zip,MobileNumber,email,pass,check);
            ExcelUtils.writeData("2", "TCs_02", "tc02_CreateNewCustomer", "Pass", "Pass");
        } catch (Exception e) {
            ExcelUtils.writeData("2", "TCs_02", "tc02_CreateNewCustomer", "Pass", "Failed");
        }
          catch (AssertionError a) {
            ExcelUtils.writeData("2", "TCs_02", "tc02_CreateNewCustomer", "Pass", String.valueOf(a));
          }
    }

}
