package au.com.carsguide.pages;

import au.com.carsguide.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FindDealerPage extends Utility
{
    private static final Logger log = LogManager.getLogger(FindDealerPage.class.getName());

    public FindDealerPage() {
        PageFactory.initElements(driver, this);
    }
    @CacheLookup
    @FindBy(xpath = "//p[@class='dealerBanner--dealershipName']")
    WebElement actualTextDealersName;

//    public String verifyTextDealerName(String result)
//    {
//        result= getTextFromElement(actualTextDealersName);
//        log.info("Verify text dealers name"+ actualTextDealersName.toString());
//        return result;
//    }

    public void verifyTextDealerName(String result)
    {
       actualTextDealersName.isDisplayed();
       log.info("Verify text dealers name"+ actualTextDealersName.toString());
    }
}
