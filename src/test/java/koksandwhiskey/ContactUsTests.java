package koksandwhiskey;

import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;

public class ContactUsTests extends BaseTest {

    @Test
    public void wrongCapcha() {
        footer.clickContactUs();
        contactUs.selectShippingSupport(1)
                .setName("testUser")
                .typeEmail("test@gmail.com")
                .setNumber("393772345")
                .setSubject("test")
                .setMessage("My test message")
                .setVerificationCode("testC");
        assertEquals(contactUs.getErrorMessageVerification(), "characters didn't match the word verification");
    }
}
