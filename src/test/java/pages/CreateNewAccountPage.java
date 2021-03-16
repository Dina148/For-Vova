package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateNewAccountPage {

    public CreateNewAccountPage(WebDriver driver){
        PageFactory.initElements(driver, this);
    }

    @FindBy()
        public WebElement accountsButton;


    @FindBy()
    public WebElement createAccountButton;


}
