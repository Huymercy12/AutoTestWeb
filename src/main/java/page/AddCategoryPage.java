package page;

import core.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddCategoryPage extends BasePage {

    public AddCategoryPage(WebDriver driver) {
        super(driver);
    }
    @FindBy(xpath = "//a[@href='/Admin/Category/Create']")
    private WebElement addnew ;
    public void click(){
        addnew.click();
    }
}
