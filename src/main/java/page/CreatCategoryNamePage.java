package page;

import core.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CreatCategoryNamePage extends BasePage {

    public CreatCategoryNamePage(WebDriver driver) {
        super(driver);
    }
    @FindBy(id = "Name")
    private WebElement name ;
    public void setName(String text){
        name.sendKeys(text);
    }
}
