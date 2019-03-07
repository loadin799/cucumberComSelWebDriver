package support;

public abstract class BaseSteps {

    protected static DriverQA driver = new DriverQA();

    public BaseSteps(){
        driver.start("chrome");
    }

}
