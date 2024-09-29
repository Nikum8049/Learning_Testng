package Guru99Assessment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Guru99Parameterise {
    WebDriver driver = null;

    @Test(dataProvider = "dp")
    public void test(String function, String keyword, String locator, String location, String data) {

        System.out.println(function + "" + keyword + "" + locator + "" + location + "" + data);
        if (keyword.equals("browser")) {
            if (data.equals("chrome")) {
                System.setProperty("Webdriver.chrome.driver", "E:\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
                driver = new ChromeDriver();
            }
        }
        else if (keyword.equals("url"))
        {
                driver.get(data);
            }
        else if (keyword.equals("type"))
        {
                if (locator.equals("id"))
                {
                    driver.findElement(By.id(location)).sendKeys(data);
                }
                else if (locator.equals("name"))
                {
                    driver.findElement(By.name(location)).sendKeys(data);
                }
                else if (locator.equals("xpath"))
                {
                    driver.findElement(By.xpath(location)).sendKeys(data);
                }
            }
        else if (keyword.equals("click"))
        {
                if (locator.equals("id"))
                {
                    driver.findElement(By.id(location)).click();
                }
                else if (locator.equals("name"))
                {
                    driver.findElement(By.name(location)).click();
                }
                else if (locator.equals("xpath"))
                {
                    driver.findElement(By.xpath(location)).click();
                }
            }
    }
    @DataProvider(name="dp")
    public  Object[][] getData()
    {
        ExcelReader ed = new ExcelReader("E:\\Framework_Excel\\testframework.xlsx","Guru");
        int rows = ed.rowCount();
        int cols = ed.colCount();

        Object obj[][] =new Object[rows-1][cols];
        for (int i = 1; i < rows; i++)
        {
            for (int j = 0; j < cols; j++)
            {
                String data = ed.getData(i, j);
                obj[i-1][j] = data;
            }
        }
        return obj;
    }
}