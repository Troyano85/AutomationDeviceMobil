package mobilTest.runner;


import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "resources/features/featureMobil/logInGmail.feature", glue = "mobilTest/step",
        snippets = CucumberOptions.SnippetType.CAMELCASE)


public class logInGmailRunner {
}
