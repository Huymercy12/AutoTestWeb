package page;

import core.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SavePage extends BasePage {

    public SavePage(WebDriver driver) {
        super(driver);
    }
    @FindBy(name = "save")
    private WebElement save ;
    @FindBy(xpath = "//div[@class='alert alert-success alert-dismissable']")
    private WebElement success ;
    public boolean verifyMessage(){
        save.click();
        success.isDisplayed();
        return false ;

    }
}
