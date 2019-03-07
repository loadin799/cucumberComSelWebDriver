package pages;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.apache.commons.io.FileUtils;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import steps.Hooks;
import support.BaseSteps;
import support.DriverQA;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;

public class HomePage extends Hooks {

    @Before
    public void seTup()
    {
        System.setProperty("webdriver.chrome.driver", "/Users/herbert.soares/Documents/Git/Drivers/chromedriver");
        WebDriver navegador = new ChromeDriver();
        navegador.get("https://www.google.com");
    }

    @Test
    public void Testenumero1(){


    }

    @Before
    public void beforeScenario(){

    }


    @After
    public void depoisDoTeste(){

    }

    public DriverQA driver;

    public HomePage(DriverQA stepDriver) {
        driver = stepDriver;
    }

    public void openPage() {
        String url = "https://www.americanas.com.br/";
        driver.openURL(url);
    }

    public void clickMotoG7() {
        driver.click("//a[@title='moto g7'][contains(text(),'moto g7')]", "xpath");
    }

    public String checkTextMotoG7() {
        return driver.getText("//h1[@class='page-title']", "xpath");
    }


}