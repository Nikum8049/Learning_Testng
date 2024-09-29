package annotationdemo;

import org.testng.annotations.Test;

public class Payment {
    @Test (groups ="smoke")
    public void debitCard()
    {
        System.out.println(" DebitCard Payment Running....");
    }
    @Test (groups = "sanity")
    public void creditCard()
    {
        System.out.println("Credit Card Payment Running....");
    }
    @Test (groups = {"smoke","sanity"})
    public void cod()
    {
        System.out.println("Cod Payment Running....");
    }
}
