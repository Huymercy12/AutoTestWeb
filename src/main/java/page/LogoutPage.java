package page;

import core.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LogoutPage extends BasePage {
    public LogoutPage(WebDriver driver) {
        super(driver);
    }
    @FindBy(xpath = "//a[@href='/logout']")
    private WebElement logout ;
    public void Logout(){
        logout.click();
    }
}
