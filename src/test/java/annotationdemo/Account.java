package annotationdemo;

import org.testng.annotations.*;

public class Account {
    @Test (groups = "sanity")
    public void savingAccount()
    {
        System.out.println("Saving Account Running....");
    }
    @Test (groups = {"smoke","sanity"})
    public void loanAccount()
    {
        System.out.println("Loan Account Running....");
    }
    @Test (groups = "smoke")
    public void currentAccount()
    {
        System.out.println("Current Account Running....");
    }


    @BeforeMethod
    public void beforeMethod()
    {
        System.out.println("Before Method Running.....");
    }

    @AfterMethod
    public  void afterMethod()
    {
        System.out.println("After Method Running....");
    }

    @BeforeClass
    public void beforeClass()
    {
        System.out.println("Running Before Class....");
    }

    @AfterClass
    public void afterClass()
    {
        System.out.println("Running After Class....");
    }

    @BeforeTest
    public void beforeTest()
    {
        System.out.println("Before Test Running....");
    }

    @AfterTest
    public void afterTest()
    {
        System.out.println("After Test Running....");
    }

    @BeforeSuite
    public void beforeSuit()
    {
        System.out.println("Before Suit Running....");
    }

    @AfterSuite
    public void afterSuit()
    {
        System.out.println("After Suit Running....");
    }




}
