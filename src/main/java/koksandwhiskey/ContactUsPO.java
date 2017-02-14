package koksandwhiskey;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class ContactUsPO extends BasePO {

    private final By shippingSupport = By.id("field-58a236d882ed5");
    private final By yourName = By.id("field-58a236d88944a");
    private final By yourEmail = By.id("field-58a236d88ae64");
    private final By yourPhone = By.id("field-58a236d88b0f4");
    private final By subject = By.id("field-58a236d88b34a");
    private final By verificationCode = By.id("field-58a239c731a53");
    private final By yourMessage = By.cssSelector("textarea.tipped");
    private final By verificationMessage = By.cssSelector(".form__left__row.row_two>.error");

    public ContactUsPO(WebDriver driver) {
        super(driver);
    }

    public ContactUsPO selectShippingSupport(int numm) {
        Select dropdown = new Select(driver.findElement(shippingSupport));
        dropdown.selectByIndex(numm);
        return this;
    }

   /* public ContactUsPO selectUnsubscribeMe(){
        Select dropdown = new Select(driver.findElement(shippingSupport));
        dropdown.selectByIndex(2);
        return this;
    }*/

    public ContactUsPO setName(String name) {
        driver.findElement(yourName).sendKeys(name);
        return this;
    }

    public ContactUsPO typeEmail(String email) {
        driver.findElement(yourEmail).sendKeys(email);
        return this;
    }

    public ContactUsPO setNumber(String number) {
        driver.findElement(yourPhone).sendKeys(number);
        return this;
    }

    public ContactUsPO setSubject(String sub) {
        driver.findElement(subject).sendKeys(sub);
        return this;
    }

    public ContactUsPO setMessage(String message) {
        driver.findElement(yourMessage).sendKeys(message);
        return this;
    }

    public ContactUsPO setVerificationCode(String code) {
        driver.findElement(verificationCode).sendKeys(code);
        return this;
    }

    public String getErrorMessageVerification() {
        return driver.findElement(verificationMessage).getText();

    }
}
