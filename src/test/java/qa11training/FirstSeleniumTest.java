package qa11training;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FirstSeleniumTest {
    WebDriver wd;

    @BeforeMethod

    public void setUp(){
        wd= new ChromeDriver();
        wd.get("https://search.maven.org/");
    }

    @Test

    public void SelTest(){
        System.out.println("Site is open");

    }
    @AfterMethod

    public void tearDown(){
        wd.quit();
    }
}
