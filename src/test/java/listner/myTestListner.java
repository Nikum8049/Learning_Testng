package listner;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.annotations.Test;

public class myTestListner implements ITestListener {
    @Override
    public void onStart(ITestContext context) {
        System.out.println("Start");
    }

    @Override
    public void onTestStart(ITestResult result) {
        System.out.println("Test Started.....");
    }

    @Override
    public void onTestSkipped(ITestResult result) {
        System.out.println("Test skipped.....");
    }

    @Override


    public void onTestSuccess(ITestResult result) {
        System.out.println("Test Success.....");
    }

    @Override
    public void onTestFailure(ITestResult result) {
        System.out.println("Test failure.....");
    }

    @Override
    public void onFinish(ITestContext context) {
        System.out.println("finished.....");
    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
        System.out.println("Test failed with percentage.....");
    }
}
