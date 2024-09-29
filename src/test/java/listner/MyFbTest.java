package listner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import util.Driveconect;

import static org.testng.AssertJUnit.assertEquals;

public class MyFbTest {
    @Test
    public void loginTest()
    {
        WebDriver driver= Driveconect.connect("https://www.fb.com");
        driver.findElement(By.id("email")).sendKeys("test@gmail.com");
        driver.findElement(By.id("pass")).sendKeys("test123");
        driver.findElement(By.name("login")).click();



        assertEquals(driver.getTitle(),"Facebook - Home");
    }

    @Test
    public void titleCheck()
    {
        WebDriver driver = Driveconect.connect("https://www.fb.com");
        assertEquals(driver.getTitle(),"Facebook – log in or sign up");
    }

}
