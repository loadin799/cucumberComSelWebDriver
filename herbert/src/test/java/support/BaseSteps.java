package support;

import org.testng.ITestResult;

public abstract class BaseSteps {

    protected static DriverQA driver = new DriverQA();

    public BaseSteps(){
        driver.start("chrome");
    }


    public abstract void onTestFailure(ITestResult arg0);
}
