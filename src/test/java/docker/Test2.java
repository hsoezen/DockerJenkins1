package docker;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class Test2 {
    @Test
    public void test1() throws MalformedURLException {
        RemoteWebDriver driver;
        String HUB_URL = "http://localhost:4444";
        DesiredCapabilities dc = new DesiredCapabilities();
        dc.setBrowserName("chrome");

        driver = new RemoteWebDriver(new URL(HUB_URL), dc);

        driver.get("https://www.fincon.eu");
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());

        driver.quit();
    }

}
