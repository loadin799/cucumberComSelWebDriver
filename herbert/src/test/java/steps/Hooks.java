package steps;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import support.BaseSteps;
import java.io.File;
import java.io.IOException;
import java.util.Calendar;

    public class Hooks extends BaseSteps {

    @Before
    public static void beforeScenario(Scenario scenario) {
        System.out.println("--- Starting scenario " + scenario.getName() + " execution ---");
    }

    @After
    public static void afterScenario(Scenario scenario) {
        System.out.println("\n--- Scenario " + scenario.getName() + " executed ---");

        if(scenario.isFailed()){
            scenario.write("url: " + driver.getCurrentUrl());
            String fileName = String.format(driver.getCurrentUrl().concat("-%d.jpg"), Calendar.getInstance().getTimeInMillis());
            TakesScreenshot camera = driver.getCamera();
            createScreenshot(camera.getScreenshotAs(OutputType.FILE), fileName);
        }

        driver.quit();
    }

    public static boolean createScreenshot(File photo, String name) {
        File destFile = new File("./screenshots/" + name);
        try{
            FileUtils.copyFile(photo, destFile);
        } catch (IOException e) {
            e.printStackTrace();
            return false;

        }
        return true;
    }

}

