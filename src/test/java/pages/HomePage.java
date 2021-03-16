package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class HomePage {

    public HomePage(WebDriver driver){
        PageFactory.initElements(driver, this);
    }

    @FindBy(id="btn-login")
    public WebElement loginButton;

    public void clickLogin(){
        loginButton.click();
    }

    @FindBy(xpath = "//div[@class='navbar-collapse navbar-body']/ul/li[contains(@class, ' active')]")
    public WebElement homePageList;

    @FindBy(xpath = "//div[@class='navbar-collapse navbar-body']/ul/li[not(position() > last() -1)]")
    public List<WebElement> navBarList;



}
