package au.com.carsguide.pages;

import au.com.carsguide.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends Utility
{
    private static final Logger log = LogManager.getLogger(HomePage.class.getName());

    public HomePage() {
        PageFactory.initElements(driver, this);
    }
    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='buy + sell']")
    WebElement mouseHoverBuySell;
    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Search Cars']")
    WebElement clickOnSearchCar;
    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Used']")
    WebElement clickOnUsedLink;
    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Find a Dealer']")
    WebElement clickOnFindADealers;

    public void mouseHoverToBuySell()
    {
        //When I mouse hover on “buy+sell” tab
        mouseHoverToElement(mouseHoverBuySell);
        log.info("Mouse hover to Buy and sell"+ mouseHoverBuySell.toString());
    }
    public void clickOnSearchCarLink()
    {
        //And I click ‘Search Cars’ link
        clickOnElement(clickOnSearchCar);
        log.info("click on search car link"+ clickOnSearchCar.toString());
    }
    public void clickOnUsedLink()
    {
        //I click ‘Used’ link
        clickOnElement(clickOnUsedLink);
        log.info("click on used link"+ clickOnUsedLink.toString());
    }
    public void clickOnFindADealersLink()
    {
        //I click ‘Used’ link
        clickOnElement(clickOnFindADealers);
        log.info("click on find dealers link"+ clickOnFindADealers.toString());
    }
}
