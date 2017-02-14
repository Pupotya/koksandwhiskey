package koksandwhiskey;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SearchPO extends BasePO {
    private final By searchField = By.cssSelector(".i.tipped");
    private final By searchLensIcon = By.cssSelector("a.icon.icon_m-glass");
    private final By notFoundErrMsg = By.cssSelector("div.main>p.error");
    private final By backLink = By.cssSelector("p.error>a");
    private final By searchResultItem = By.cssSelector("div.product");


    public SearchPO(WebDriver driver) {
        super(driver);
    }

    public SearchPO enterSearchField(String request) {
        driver.findElement(searchField).sendKeys(request);
        return this;
    }

    public SearchPO clickSearchLensIcon() {
        driver.findElement(searchLensIcon).click();
        return this;
    }

    public String getNotFoundErrMsg() {
        return driver.findElement(notFoundErrMsg).getText();
    }

    public void clickBack(){
        driver.findElement(backLink).click();
    }

    public boolean isResultContainProducts(){
        return getElementsCount(searchResultItem) > 0;
    }
}
