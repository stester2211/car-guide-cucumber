package au.com.carsguide.steps;

import au.com.carsguide.pages.FindDealerPage;
import au.com.carsguide.pages.HomePage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class FindDealersSteps
{
    @And("^I mouse hover on buy\\+sell tab for finddealers$")
    public void iMouseHoverOnBuySellTabForFinddealers() {
        new HomePage().mouseHoverToBuySell();
    }

    @When("^I click ‘Find a Dealer’$")
    public void iClickFindADealer() {
        new HomePage().clickOnFindADealersLink();
    }

    @Then("^I navigate to ‘car-dealers’ page$")
    public void iNavigateToCarDealersPage() {
    }

    @And("^I should see the dealer names \"([^\"]*)\" are display on page$")
    public void iShouldSeeTheDealerNamesAreDisplayOnPage(String displayedText) {
        new FindDealerPage().verifyTextDealerName(displayedText);
    }
}
