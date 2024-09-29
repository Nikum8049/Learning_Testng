package AssingmentTestNGmodule7;

import org.testng.annotations.Test;

public class A004GroupTestSuit {
    @Test(groups = "smoke")
    public void testMethod1() {
        System.out.println("Smoke test method 1 executed.");
    }

    @Test(groups = "regression")
    public void testMethod2() {
        System.out.println("Regression test method 2 executed.");
    }

    @Test(groups = {"smoke", "regression"})
    public void testMethod3() {
        System.out.println("Smoke and Regression test method 3 executed.");
    }
}
