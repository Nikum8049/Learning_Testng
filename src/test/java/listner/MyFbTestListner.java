package listner;

import org.openqa.selenium.WebDriver;
import org.testng.ITestListener;
import org.testng.ITestResult;
import util.Driveconect;

public class MyFbTestListner implements ITestListener {
    @Override
    public void onTestStart(ITestResult result)
    {
        ITestListener.super.onTestStart(result);
    }

    @Override
    public void onTestSuccess(ITestResult result)
    {
        ITestListener.super.onTestSuccess(result);
    }

    @Override
    public void onTestFailure(ITestResult result)
    {
        Driveconect.screenShotstops("fb");
    }

//    @Override
//    public void onTestFailure(ITestResult result) {
//        //WebDriver driver = (WebDriver) result.getTestContext().getAttribute("WebDriver");
//        Driveconect.screenShotstops(driver, "fb");


}
