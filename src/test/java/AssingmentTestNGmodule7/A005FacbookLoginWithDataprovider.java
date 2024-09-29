package AssingmentTestNGmodule7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WrapsDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import util.Driveconect;

import static util.Driveconect.driver;

public class A005FacbookLoginWithDataprovider {

    WebDriver driver=null;
    @BeforeTest
    public void setUp() {

        driver = Driveconect.connect("https://www.facebook.com");
    }

    @DataProvider(name = "loginData")
    public Object[][] getData() {
        return new Object[][]
                {{"nikunjkava@gmail.com", "nikun45891"},
                {"tadvi@gmail.com", "tadvi4568"},
                {"niks@gmail.com", "niks4587"}
                 };
    }

    @Test(dataProvider = "loginData")
    public void testLogin(String username, String password) {
        driver.findElement(By.id("email")).sendKeys(username);
        driver.findElement(By.id("pass")).sendKeys(password);
        driver.findElement(By.name("login")).click();

        String homeTitle = driver.getTitle();
        assert homeTitle.contains("Facebook – log in or sign up") : "Login failed for user: " + username;
    }

    @AfterTest
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }

}
