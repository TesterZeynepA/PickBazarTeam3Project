package tests.ZeynepAytop.US_013Tests;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features",
        glue = "stepdefinitions",
        tags = "@urunBulundu",
        dryRun = false
)
public class TC_007_008_009_010 {
}
