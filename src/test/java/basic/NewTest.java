package basic;

import org.testng.annotations.Test;

public class NewTest {

    @Test(priority =2 )
    public void test()
    {
        System.out.println("Running Test first..........");
    }

    @Test (priority = 3,enabled = false)
    public void alpha()
    {
        System.out.println(" Running Alpha test second.........");
    }
    @Test(priority = 1)
    public void beta()
    {
        System.out.println("Running Beta test last.....");
    }
}
