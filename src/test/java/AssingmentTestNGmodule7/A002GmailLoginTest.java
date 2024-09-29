package AssingmentTestNGmodule7;

import com.beust.jcommander.Parameterized;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;
import util.Driveconect;



public class A002GmailLoginTest {
    private WebDriver driver;

    @BeforeTest
    public void setUp() {
        // Set the path for the ChromeDriver
        System.setProperty("webdriver.chrome.driver", "E:\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @Test
    public void testGmailLogin() {
        driver.get("https://www.gmail.com");

        driver.findElement(By.id("identifierId")).sendKeys("nikum@gmail.com");
        driver.findElement(By.id("identifierNext")).click();
        driver.findElement(By.name("password")).sendKeys("nikum4850");
        driver.findElement(By.id("passwordNext")).click();

        String inboxTitle = driver.getTitle();
        assert inboxTitle.contains("Inbox") : "Login failed!";
    }


    @AfterTest
    public void quit() {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        if (driver != null) {
            driver.quit();
        }
    }

}
