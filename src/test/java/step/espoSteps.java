package step;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.HomePage;
import util.Driver;

import java.util.ArrayList;
import java.util.List;

public class espoSteps {

    WebDriver driver;
    HomePage homePage;


    @Given("the user navigate the {string}")
    public void the_user_navigate_the(String url) {
        driver=Driver.getDriver();
        driver.get(url);


    }
    @When("the user opens the home page")
    public void theUserOpensTheHomePage() {
        homePage=new HomePage(driver);
        homePage.clickLogin();
    }


    @Then("the user should see the titles")
    public void the_user_should_see_the_titles(List<String> navBar) {
        List<String> titles=new ArrayList<>();
        for (WebElement e: homePage.navBarList){
            titles.add(e.getText());
        }
        System.out.println(titles.toString());
        Assert.assertEquals(navBar, titles);


    }



}
