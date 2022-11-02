package page;

import core.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage extends BasePage {

    public LoginPage(WebDriver driver) {
        super(driver);
    }
    @FindBy(id = "Email")
    private WebElement email;
    @FindBy(id = "Password")
    private WebElement password;
    @FindBy(xpath = "//button[@type='submit']")
    private WebElement signinbutton ;
    @FindBy(xpath = "//aside[@class='main-sidebar sidebar-dark-primary elevation-4']")
    private WebElement menuleft ;
    public void navigateToLogin(String url) {
        getDriver().get(url);
        //getWait().until(ExpectedConditions.visibilityOf(email));
    }
    public void login(String u, String p) {
        email.clear();
        email.sendKeys(u);
         password.clear();
        password.sendKeys(p);
        signinbutton.click();
    }
    public boolean verifyMenu() {
       menuleft.isDisplayed();
       return false ;
    }
}