package Guru99Assessment;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import util.Driveconect;

public class Guru99ParameteriseTestListner implements ITestListener {

    @Override
    public void onStart(ITestContext context) {
        ITestListener.super.onStart(context);
    }

    @Override
    public void onTestStart(ITestResult result) {
        ITestListener.super.onTestStart(result);
    }

    @Override
    public void onTestSuccess(ITestResult result) {
        ITestListener.super.onTestSuccess(result);
        System.out.println("Test Passed");
    }

    @Override
    public void onTestFailure(ITestResult result)
    {
        Driveconect.screenShotstops("guru");
    }

}
