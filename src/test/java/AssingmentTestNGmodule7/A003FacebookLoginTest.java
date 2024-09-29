package AssingmentTestNGmodule7;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class A003FacebookLoginTest
{
        private WebDriver driver;

        @BeforeTest
        public void setUp()
        {
            // Set the path for the ChromeDriver
            System.setProperty("webdriver.chrome.driver", "E:\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
            driver = new ChromeDriver();
            driver.get("https://www.facebook.com");
            driver.manage().window().maximize();

        }

        @Parameters({"username", "password"})
        @Test
        public void testFacebookLogin(String username, String password)
        {
            driver.findElement(By.id("email")).sendKeys(username);
            driver.findElement(By.id("pass")).sendKeys(password);

            driver.findElement(By.name("login")).click();

            String homeTitle = driver.getTitle();
            assert homeTitle.contains("Facebook") : "Login failed!";
        }

        @AfterTest
        public void quit()
        {
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            if (driver != null)
            {
                driver.quit();
            }
        }
}

