package docker;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.*;

import java.net.MalformedURLException;
import java.net.URL;

public class Test1 {
    RemoteWebDriver driver;
    @BeforeClass
    public void setUp() throws MalformedURLException {
        String HUB_URL = "http://localhost:4444";
        DesiredCapabilities dc = new DesiredCapabilities();
        dc.setBrowserName("chrome");

        driver = new RemoteWebDriver(new URL(HUB_URL), dc);

    }

    @Test
    public void test1(){
        driver.get("https://www.fincon.eu");
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());
    }


    @AfterClass
    public void tearDown(){
        driver.quit();
    }
}
