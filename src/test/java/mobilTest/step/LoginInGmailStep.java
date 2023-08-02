package mobilTest.step;

import driver.MyDriverMobil;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.thucydides.core.annotations.Managed;
import tasks.StarSesionGmail;

import static util.constants.AnswerMessages.BANDEJA_ENTRADA;


public class LoginInGmailStep {
    @Managed(driver = "appium")

    MyDriverMobil driver;

    Actor actor = Actor.named("userMobil");


    @Given("user in the home page Gmail")
    public void userInTheHomePageGmail() throws Exception {
        driver.initAndroid();

    }

    @When("user into de data")
    public void userIntoDeData(io.cucumber.datatable.DataTable dataTable) {
        actor.attemptsTo(StarSesionGmail.enter(dataTable));

    }

    @Then("user sees the destination {string}")
    public void userSeesTheDestination(String string) {
        driver.quit();
    }
     //   EnsureFieldVisible.ensureThat(actor).canSee(BANDEJA_ENTRADA.resolveFor(actor));

}
