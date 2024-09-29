package listner;

import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class myTest {

    @Test (priority = 2)
    public void test1()
    {
        System.out.println("Running Test1....");
        assertEquals(10,50);
    }

    @Test(priority = 1)
    public void test2()
    {
        System.out.println("Runnig Test2....");

    }
}
