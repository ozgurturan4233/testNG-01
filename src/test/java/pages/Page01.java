package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class Page01 {
    WebDriver driver;
    public Page01(WebDriver driver) {
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }
    @FindBy(id="nav-logo")
    public WebElement logo;
    @FindBy(id="cookieAcceptanceAll")
    public WebElement cookiePoP;
    @FindBy(id="search-icon")
    public WebElement search;
    @FindBy(id="search-box")
    public WebElement searchBox;
}
