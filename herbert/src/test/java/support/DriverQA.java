package support;

import io.github.bonigarcia.wdm.ChromeDriverManager;
import io.github.bonigarcia.wdm.FirefoxDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.interactions.HasInputDevices;
import org.openqa.selenium.interactions.Keyboard;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class DriverQA {

    private static WebDriver driver;
    private static final long IMPLICITLY_WAIT_TIMEOUT = 10;

    public void start(String parBrowser) {
        String title;
        try {
            title = driver.getTitle();
        } catch (Exception e) {
            title = "ERROR";
        }
        if (title.equals("ERROR")) {
            switch (parBrowser) {
                case "firefox":
                    FirefoxDriverManager.getInstance().setup();
                    FirefoxOptions options = new FirefoxOptions();
                    options.addPreference(FirefoxDriver.MARIONETTE, true);
                    driver = new FirefoxDriver(options);
                    driver.manage().window().maximize();
                    break;
                case "chrome":
                    ChromeDriverManager.getInstance().setup();
                    ChromeOptions optionsC = new ChromeOptions();
                    // hides the info message that says chrome is being controlled by automated test software
                    optionsC.addArguments(Arrays.asList(
                            "disable-infobars", "ignore-certificate-errors",
                            "start-maximized"));
                    driver = new ChromeDriver(optionsC);
                    break;
                default:
                    break;
            }
        }
        driver.manage().timeouts().implicitlyWait(IMPLICITLY_WAIT_TIMEOUT, TimeUnit.SECONDS);
    }

    private String getAttributeType(String... parType) {
        String type;
        if (parType.length == 0) {
            type = "id";
        } else {
            type = parType[0];
        }
        return type;
    }

    private By getLocatorBy(String parValue, String... parType) {
        final String selector = getAttributeType(parType);
        switch (selector) {
            case "id":
                return By.id(parValue);
            case "name":
                return By.name(parValue);
            case "css":
                return By.cssSelector(parValue);
            case "xpath":
                return By.xpath(parValue);
            case "link":
                return By.linkText(parValue);
            default:
                return By.id(parValue);
        }
    }

    private WebElement findElem(String parValue, String... parType) {
        final By locator = getLocatorBy(parValue, parType);
        WebElement element;
        try {
            element = driver.findElement(locator);
        } catch (NoSuchElementException e) {
            element = null;
        }
        return element;
    }

    private List<WebElement> findElems(String parValue, String... parType) {
        List<WebElement> elements;
        final By locator = getLocatorBy(parValue, parType);
        try {
            elements = driver.findElements(locator);
        } catch (NoSuchElementException e) {
            e.printStackTrace();
            elements = Collections.emptyList();
        }
        return elements;
    }

    public void click(String parValue, String... parType) {
        final WebElement element = findElem(parValue, parType);
        element.click();
    }

    public void openURL(String parUrl) {
        driver.get(parUrl);
    }

    public void quit() {
        driver.quit();
    }

    public void sendKeys(String parText, String parName, String... parType) {
        final WebElement element = findElem(parName, parType);
        element.clear();
        element.sendKeys(parText);
    }

    public void sendKeyboard(String parName, String... parType) {
        Keyboard keyboard = ((HasInputDevices) driver).getKeyboard();
        String param2 = getAttributeType(parType);
        try {
            switch (param2) {
                case "ENTER":
                    keyboard.pressKey(Keys.ENTER);
                case "ALT":
                    keyboard.pressKey(Keys.ALT);
                case "TAB":
                    keyboard.pressKey(Keys.TAB);
                case "ESC":
                    keyboard.pressKey(Keys.ESCAPE);
            }
        } catch (NoSuchElementException e) {
            System.out.println("ERROR => " + e.toString());
        }
    }

    public String getText(String parValue, String... parType) {
        final WebElement element = findElem(parValue, parType);
        return element.getText();
    }

    public String getCurrentUrl() {
        return driver.getCurrentUrl();
    }

    public TakesScreenshot getCamera() {
        return (TakesScreenshot) driver;
    }
}
