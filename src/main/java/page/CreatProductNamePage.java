package page;

import core.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CreatProductNamePage extends BasePage {

    public CreatProductNamePage(WebDriver driver) {
        super(driver);
    }
    @FindBy(id = "Name")
    private WebElement name ;
    @FindBy(id = "ShortDescription")
    private WebElement description ;
    @FindBy(id = "Sku")
    private WebElement sku ;
    @FindBy(xpath = "(//input[@class='k-input k-readonly'])[1]")
    private WebElement category ;
    @FindBy(xpath = "(//input[@class='k-formatted-value k-input'])[2]")
    private WebElement price ;
    @FindBy(xpath = "(//input[@class='k-formatted-value k-input'])[3]")
    private WebElement oldprice ;
    public void setName(String a,String b,String c,String d,String e,String f){
        name.sendKeys(a);
        description.sendKeys(b);
        sku.sendKeys(c);
        category.sendKeys(d);
        price.sendKeys(e);
        oldprice.sendKeys(f);

    }
}