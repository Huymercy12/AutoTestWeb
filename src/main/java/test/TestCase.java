package test;

import core.BaseTest;
import core.ExcelUtils;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import page.*;
public class TestCase extends BaseTest {
    private ExcelUtils excel;
    @BeforeClass
    public void Setup() {
        excel = new ExcelUtils();
    }

    @Test
    public void test1() throws Exception {
        excel.setExcelFile("D://TestDataDemo.xlsx", "Sheet2");
        SoftAssert softAssert = new SoftAssert();
        LoginPage loginPage = new LoginPage(getDriver());
        CategoriesPage categoriesPage = new CategoriesPage(getDriver());
        AddCategoryPage addnewPage = new AddCategoryPage(getDriver());
        CreatCategoryNamePage inputNamePage = new CreatCategoryNamePage(getDriver());
        SavePage savePage = new SavePage(getDriver());
        LogoutPage logoutPage = new LogoutPage(getDriver());
        loginPage.navigateToLogin(excel.getCellData("URL", 1));
        loginPage.login(excel.getCellData("Email", 1), excel.getCellData("Pass", 1));
        softAssert.assertTrue(loginPage.verifyMenu());
        categoriesPage.Displayed();
        softAssert.assertTrue(categoriesPage.Displayed());
        addnewPage.click();
        inputNamePage.setName(excel.getCellData("text", 1));
        softAssert.assertTrue(savePage.verifyMessage());
        logoutPage.Logout();
        excel.setCellData("Pass",1,10);
    }
    @Test
    public void test2() throws Exception {
        excel.setExcelFile("D://TestDataDemo.xlsx", "Sheet2");
        SoftAssert softAssert = new SoftAssert();
        LoginPage loginPage = new LoginPage(getDriver());
        ProductPage productPage = new ProductPage(getDriver());
        AddProductPage addProductPage = new AddProductPage(getDriver());
        CreatProductNamePage creatProductNamePage = new CreatProductNamePage(getDriver());
        SavePage savePage = new SavePage(getDriver());
        LogoutPage logoutPage = new LogoutPage(getDriver());
        loginPage.navigateToLogin(excel.getCellData("URL", 2));
        loginPage.login(excel.getCellData("Email", 2), excel.getCellData("Pass", 2));
        softAssert.assertTrue(loginPage.verifyMenu());
        productPage.Displayed();
        softAssert.assertTrue(productPage.Displayed());
        addProductPage.click();
        creatProductNamePage.setName(excel.getCellData("text", 2), excel.getCellData("Description",2), excel.getCellData("Category",2), excel.getCellData("SKU",2), excel.getCellData("Price",2), excel.getCellData("Old price",2) );
        softAssert.assertTrue(savePage.verifyMessage());
        logoutPage.Logout();
        excel.setCellData("Pass",2,10);
    }


}