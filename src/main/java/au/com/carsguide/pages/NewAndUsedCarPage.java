package au.com.carsguide.pages;

import au.com.carsguide.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NewAndUsedCarPage extends Utility
{
    private static final Logger log = LogManager.getLogger(NewAndUsedCarPage.class.getName());
    public NewAndUsedCarPage() {
        PageFactory.initElements(driver, this);
    }
    @CacheLookup
    @FindBy(xpath = "//select[@id='makes']")
    WebElement selectMake;
    @CacheLookup
    @FindBy(xpath = "//select[@id='models']")
    WebElement selectModel;
    @CacheLookup
    @FindBy(xpath = "//select[@id='locations']")
    WebElement selectLocation;
    @CacheLookup
    @FindBy(xpath = "//select[@id='priceTo']")
    WebElement selectPrice;
    @CacheLookup
    @FindBy(xpath = "//input[@id='search-submit']")
    WebElement clickFindBtn;

    public void selectMakeDropDown(String make)
    {
        //And I select make “<make>”
        selectByVisibleTextFromDropDown(selectMake,make);
        log.info("Select Make dropdown"+ selectMake.toString());
    }
    public void selectModelDropDown(String model)
    {
        //And I select model “<model>”
        selectByVisibleTextFromDropDown(selectModel,model);
        log.info("Select Model dropdown"+ selectModel.toString());
    }
    public void selectLocationDropDown(String location)
    {
        //And I select location “<location>”
        selectByVisibleTextFromDropDown(selectLocation,location);
        log.info("Select location dropdown"+ selectLocation.toString());
    }
    public void selectPriceDropDown(String price)
    {
        //And I select price “<price>”
        selectByVisibleTextFromDropDown(selectPrice,price);
        log.info("Select location dropdown"+ selectPrice.toString());
    }
    public void clickOnFindMyNextCar()
    {
        //And I click on Find My Next Car tab
        clickOnElement(clickFindBtn);
        log.info("Click On find My Button"+ clickFindBtn.toString());
    }

}
