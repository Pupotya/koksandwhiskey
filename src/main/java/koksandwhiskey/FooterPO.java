package koksandwhiskey;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FooterPO extends BasePO {

    private final By selMain = By.linkText("Main");
    private final By selAbout_us = By.cssSelector(".bmenu a[href='/about-us/']");
    private final By selFAQ = By.linkText("F.A.Q.");
    private final By selOur_policies = By.linkText("Our policies");
    private final By selTrack_my_order = By.linkText("Track my order");
    private final By selOur_cart = By.linkText("Your cart");
    private final By selContact_us = By.linkText("Contact us");
    private final By selReport_spam = By.linkText("Report spam");

    public FooterPO(WebDriver driver) {
        super(driver);
    }

    public void clickMain() {
        driver.findElement(selMain).click();
    }

    public FooterPO clickAbout_us() {
        driver.findElement(selAbout_us).click();
        return this;
    }

    public FooterPO clickFAQ() {
        driver.findElement(selFAQ).click();
        return this;
    }

    public FooterPO clickOur_policies() {
        driver.findElement(selOur_policies).click();
        return this;
    }

    public FooterPO clickTrack_my_order() {
        driver.findElement(selTrack_my_order).click();
        return this;
    }

    public FooterPO clickOur_cart() {
        driver.findElement(selOur_cart).click();
        return this;
    }

    public FooterPO clickContactUs() {
        driver.findElement(selContact_us).click();
        return this;
    }

    public FooterPO clickReport_spam() {
        driver.findElement(selReport_spam).click();
        return this;
    }
}