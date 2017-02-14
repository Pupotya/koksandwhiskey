package koksandwhiskey;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;


public class SearchTests extends BaseTest {

    @BeforeMethod
    public void beforeEachTest(){
        mainPage.open();
    }

    @Test
    public void searchForValidProduct() {
        //when
        String productName = "tablets";
        search.enterSearchField(productName)
                .clickSearchLensIcon();
        //then
        assertTrue(search.isResultContainProducts());
    }

    @Test
    public void searchForUnavailableProductAndCheckBackLink(){
        //when
        String productName = "unavailable_drug";
        String actualResult = search.enterSearchField(productName)
                .clickSearchLensIcon().getNotFoundErrMsg();
        //then
        String expectedResult = "No items found by search keyword" + productName;
        assertEquals(expectedResult,actualResult);
        assertFalse(search.isResultContainProducts());
        //when
        search.clickBack();
        //then
        assertTrue(mainPage.isMainPageOpened());
    }
}
