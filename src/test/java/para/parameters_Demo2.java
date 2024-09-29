package para;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import util.Driveconect;

public class parameters_Demo2 {

WebDriver driver = null;

   @BeforeClass
   public void setUp()
   {
       driver= Driveconect.connect("https://www.facebook.com/");
   }


   @Test(dataProvider = "dp")

    public void test(String userEmail,String userPass)
    {
        WebElement email = driver.findElement(By.id("email"));
        WebElement pass = driver.findElement(By.id("pass"));
        WebElement login = driver.findElement(By.name("login"));

        email.clear();
        email.sendKeys(userEmail);
        pass.clear();
        pass.sendKeys(userPass);
        login.click();


        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        driver.navigate().back();
    }
    @DataProvider(name="dp")

    public Object[][] setData()
    {
        Object obj [][] = new Object[4][2];

        obj[0][0] = "test@gmail.com";
        obj[0][1] = "test";

        obj[1][0] = "tech@gmail.com";
        obj[1][1] = "tech";

        obj[2][0] = "abc@gmail.com";
        obj[2][1] = "abc";

        obj[3][0] = "xyz@gmail.com";
        obj[3][1] = "xyz";
        return obj;
    }
}
