package koksandwhiskey;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public abstract class BasePO {
    protected WebDriver driver;


    public BasePO(WebDriver driver) {
        this.driver = driver;
    }

    //this constructor shouldn't be used
    private BasePO() {
        super();
    }

    protected int getElementsCount(By selector){
        return driver.findElements(selector).size();
    }
}
