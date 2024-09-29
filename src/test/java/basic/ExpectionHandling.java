package basic;

import org.testng.annotations.Test;

public class ExpectionHandling {
    @Test (expectedExceptions = ArithmeticException.class)
    public void test()
    {
        int i = 10;
        int j = i/0;
    }

    @Test (expectedExceptions = ArrayIndexOutOfBoundsException.class) // only Exception.class jo nai khabr hoi exception to
    public void test1()
    {
        int a[] = new int[5];
        a[6] = 10;
    }
}
