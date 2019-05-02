package steps;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.junit.Assert;
import pages.HomePage;
import support.BaseSteps;

public class HomePageSteps extends BaseSteps {

    public static HomePage homePage = new HomePage(driver);

    @Given("^User access the Amaricanas Website$")
    public void userAccessTheAmericanasWebsite() {
        homePage.openPage();
    }

    @Given("^User clicks on moto g7$")
    public void userClickOnMotoG7() {
        homePage.clickMotoG7();
    }

    @Then("^User views \"([^\"]*)\" on screen moto g7$")
    public void userValidateStringMotoG7(String value) throws Throwable {
        Assert.assertEquals(value, homePage.checkTextMotoG7());
    }

    @Given("^User Write \"([^\"]*)\" on field for Search$")
    public void userWriteOnFieldSearch(String value) throws InterruptedException {
         homePage.writeFieldSearch(value);
    }

    @And("^User Click For Search$")
    public void userClickForSearch() {
        homePage.clickForSearch();
    }

    @Then("^User views \"([^\"]*)\" For Title Search$")
    public void userCheckTitleForSearch(String value) throws Throwable {
        Assert.assertEquals(value, homePage.checkTitleForSearch());
    }
}


