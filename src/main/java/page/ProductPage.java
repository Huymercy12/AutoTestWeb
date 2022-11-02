package page;

import core.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductPage extends BasePage {

    public ProductPage(WebDriver driver) {
        super(driver);
    }
    @FindBy(xpath = "(//a[@href='#'])[4]")
    private WebElement catalog ;
    @FindBy(xpath = "//a[@href='/Admin/Product/List']")
    private WebElement product ;
    @FindBy(xpath = "//a[@href='/Admin/Product/Create']")
    private WebElement addnew ;
    @FindBy(xpath = "(//button[@type='button'])[2]")
    private WebElement export ;
    @FindBy(xpath = "//button[@name='importexcel']")
    private WebElement importt ;
    @FindBy(xpath = "//button[@id='delete-selected']")
    private WebElement delete ;
    @FindBy(id = "SearchProductName")
    private WebElement name ;
    @FindBy(id = "SearchWarehouseId")
    private WebElement warehouse ;
    @FindBy(id = "SearchCategoryId")
    private WebElement category ;
    @FindBy(id = "SearchProductTypeId")
    private WebElement type ;
    public boolean Displayed(){
        catalog.click();
        product.click();
        addnew.isDisplayed();
        export.isDisplayed();
        importt.isDisplayed();
        delete.isDisplayed();
        name.isDisplayed();
        warehouse.isDisplayed();
        category.isDisplayed();
        type.isDisplayed();
        return false ;
    }
}
