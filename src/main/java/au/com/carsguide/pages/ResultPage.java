package au.com.carsguide.pages;

import au.com.carsguide.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ResultPage extends Utility
{
    private static final Logger log = LogManager.getLogger(ResultPage.class.getName());
    public ResultPage() {
        PageFactory.initElements(driver, this);
    }
    @CacheLookup
    //@FindBy(css = ".h1Text.search--title")
    @FindBy(xpath = "//div[@class='makeFilter']//div[@class='mmvs']")
    WebElement actualTextResult;

    public String verifyTextResultPage()
    {
        //Then I should see the make “<make>” in results
        String result= getTextFromElement(actualTextResult);
        log.info("Verify text result"+ actualTextResult.toString());
        return result;
    }
}
