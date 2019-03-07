package steps;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.apache.commons.io.FileUtils;
import org.junit.Assert;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import pages.HomePage;
import support.BaseSteps;

import java.io.File;
import java.io.IOException;
import java.util.Calendar;

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

    @Then("^User views \"([^\"]*)\" on screen moto g7")
    public void userValidateStringMotoG7(String value) throws Throwable {
        Assert.assertEquals(value, homePage.checkTextMotoG7());
    }

    @Override
    public void onTestFailure(ITestResult arg0) {
        System.out.println("Failure detected...");
        String fileName = String.format("Screenshot-%s.jpg", Calendar.getInstance().getTimeInMillis());
        WebDriver driver = (WebDriver)arg0.getTestContext().getAttribute("webDriver");
        TakesScreenshot ts = (TakesScreenshot)driver;
        File srcFile = ts.getScreenshotAs(OutputType.FILE);
        File destFile = new File("./screenshots/" + fileName);
        try{
            FileUtils.copyFile(srcFile, destFile);
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("Screenshot taken");
    }
}


