package au.com.carsguide.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

/**
 * Created by Jay Vaghani
 */
@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/java/resources/featurefile/buy.feature",
        glue = "au/com/carsguide",
        tags= "@smoke",
        plugin = {"pretty", "html:target/cucumber-report/cucumber.html"}
)
public class BuyPageSmokeRunner {

}
