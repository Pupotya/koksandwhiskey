package koksandwhiskey;

import org.openqa.selenium.WebDriver;

public class MainPagePO extends BasePO {
    public static final String BASE_URL = "http://canadian-pharmacy-exp.net/";

    public MainPagePO(WebDriver driver) {
        super(driver);
    }

    public void open(String baseUrl) {
        driver.get(baseUrl);
        driver.manage().window().maximize();
    }

    public boolean isMainPageOpened(){
        return driver.getCurrentUrl().equals(BASE_URL);
    }

    public void open() {
        open(BASE_URL);
    }
}
