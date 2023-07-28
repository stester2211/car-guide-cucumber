package au.com.carsguide.steps;

import au.com.carsguide.pages.HomePage;
import au.com.carsguide.pages.NewAndUsedCarPage;
import au.com.carsguide.pages.ResultPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class BuySteps
{
    @And("^I mouse hover on buy\\+sell tab$")
    public void iMouseHoverOnBuySellTab() {
        new HomePage().mouseHoverToBuySell();
    }

    @When("^I click ‘Search Cars’ link$")
    public void iClickSearchCarsLink() {
        new HomePage().clickOnSearchCarLink();
    }

    @Then("^I navigate to ‘new and used car search’ page$")
    public void iNavigateToNewAndUsedCarSearchPage() {
        
    }

    @And("^I select make \"([^\"]*)\"$")
    public void iSelectMake(String make)  {
        new NewAndUsedCarPage().selectMakeDropDown(make);

    }

    @And("^I select model \"([^\"]*)\"$")
    public void iSelectModel(String model) {
        new NewAndUsedCarPage().selectModelDropDown(model);
    }

    @And("^I select location \"([^\"]*)\"$")
    public void iSelectLocation(String location)  {
        new NewAndUsedCarPage().selectLocationDropDown(location);
    }

    @And("^I select price \"([^\"]*)\"$")
    public void iSelectPrice(String price) {
        new NewAndUsedCarPage().selectPriceDropDown(price);
    }

    @And("^I click on Find My Next Car tab$")
    public void iClickOnFindMyNextCarTab() {
        new NewAndUsedCarPage().clickOnFindMyNextCar();
    }

    @Then("^I should see the make \"([^\"]*)\" in results$")
    public void iShouldSeeTheMakeInResults(String makeResult)  {
        Assert.assertEquals("Result text not found",makeResult, new ResultPage().verifyTextResultPage());
    }

    @When("^I click ‘Used’ link$")
    public void iClickUsedLink() {
        new HomePage().clickOnUsedLink();
    }

    @Then("^I navigate to ‘Used Cars For Sale’ page$")
    public void iNavigateToUsedCarsForSalePage() {
    }

}
