package amazonTitleCheck;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;
import util.Driveconect;

public class amazontitlecheck {

    WebDriver driver = null;

    //sausedemo.com

    @Test
    public void setUp()
    {
        driver = Driveconect.connect("https://www.amazon.in/");
    }

    @Test(priority = 1)
    public void sell()
    {
        driver.findElement(By.linkText("Sell")).click();
        System.out.println("Sell tab Title : " + driver.getTitle());
    }

    @Test(priority = 2)
    public void mobile()
    {
        driver.findElement(By.linkText("Mobile")).click();
        System.out.println("Mobile Tab Title" + driver.getTitle());
    }

    @BeforeMethod
    public void home()
    {
        System.out.println(driver.getTitle());
    }

    @AfterMethod
    public void back()
    {
        driver.navigate().back();
    }

    @AfterClass
    public void finish()
    {
        driver.close();
    }
}
