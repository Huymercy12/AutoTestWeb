package page;

import core.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CategoriesPage extends BasePage {

    public CategoriesPage(WebDriver driver) {
        super(driver);
    }
    @FindBy(xpath = "(//a[@href='#'])[4]")
    private WebElement catalog ;
    @FindBy(xpath = "(//a[@href='/Admin/Category/List'])[1]")
    private WebElement categories ;
    @FindBy(xpath = "//a[@href='/Admin/Category/Create']")
    private WebElement addnew ;
    @FindBy(xpath = "(//button[@type='button'])[2]")
    private WebElement export ;
    @FindBy(xpath = "//button[@name='importexcel']")
    private WebElement importt ;
    @FindBy(xpath = "//button[@id='delete-selected']")
    private WebElement delete ;
    @FindBy(id = "SearchCategoryName")
    private WebElement name ;
    @FindBy(id = "SearchPublishedId")
    private WebElement published ;
   public boolean Displayed(){
       catalog.click();
       categories.click();
       addnew.isDisplayed();
       export.isDisplayed();
       importt.isDisplayed();
       delete.isDisplayed();
       name.isDisplayed();
       published.isDisplayed();
       return false ;
   }
}
