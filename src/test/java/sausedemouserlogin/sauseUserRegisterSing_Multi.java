package sausedemouserlogin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import util.Driveconect;

public class sauseUserRegisterSing_Multi {

    WebDriver driver = null;

    @BeforeClass
    public void homepagesouce()
    {
        driver = Driveconect.connect("https://www.saucedemo.com/v1/");
    }
    @Test(dataProvider = "sdemo")
    public void testdata(String userEmail, String userPass)
    {
        WebElement username = driver.findElement(By.id("user-name"));
        WebElement pass = driver.findElement(By.id("password"));
        WebElement login = driver.findElement(By.id("login-button"));

        username.clear();
        username.sendKeys(userEmail);
        pass.clear();
        pass.sendKeys(userPass);

        login.click();
        WebElement add =  driver.findElement(By.xpath("//div[@class='inventory_list']//div[1]//div[3]//button[1]"));
        add.click();

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.navigate().back();
    }
    @DataProvider(name="sdemo")
    public Object[][] setData()
    {
        Object obj [][] = new Object[3][2];
        obj[0][0] = "standard_user";
        obj[0][1] = "secret_sauce";


        obj[1][0] = "problem_user";
        obj[1][1] = "secret_sauce";

        obj[2][0] = "performance_glitch_user";
        obj[2][1] = "secret_sauce";
        return obj;
    }
}
