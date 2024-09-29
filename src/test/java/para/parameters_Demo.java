package para;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import util.Driveconect;

public class parameters_Demo {


    @Parameters({"uname","pass"})
    @Test
    public void test(String userEmail,String userpass)
    {
        WebDriver driver = Driveconect.connect("https://www.facebook.com/");
        WebElement email = driver.findElement(By.id("email"));
        WebElement pass = driver.findElement(By.id("pass"));
        WebElement login = driver.findElement(By.name("login"));

        email.sendKeys("userEmail");
        pass.sendKeys("userpass");
        login.click();
    }
}
