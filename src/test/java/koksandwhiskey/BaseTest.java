package koksandwhiskey;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import org.testng.annotations.*;

public abstract class BaseTest {

    protected WebDriver driver;
    protected ContactUsPO contactUs;
    protected FooterPO footer;
    protected SearchPO search;
    protected MainPagePO mainPage;


    @BeforeClass
    public void precondition() {
        driver = initDriver();
        contactUs = new ContactUsPO(driver);
        footer = new FooterPO(driver);
        search = new SearchPO(driver);
        mainPage = new MainPagePO(driver);
    }

    private WebDriver initDriver() {
        Properties prop = new Properties();
        ClassLoader loader = Thread.currentThread().getContextClassLoader();
        InputStream stream = loader.getResourceAsStream("drugstest.properties");
        try {
            prop.load(stream);
        } catch (IOException e) {
            e.printStackTrace();
        }

        String browserName = prop.getProperty("browser");

        switch (browserName) {
            case "firefox":
                return new FirefoxDriver();
            case "chome":
                return new ChromeDriver();
            case "edge":
                return new EdgeDriver();
        }

        return new ChromeDriver();
    }

    @AfterClass
    public void postcondition() {
//        driver.quit();
    }
}
