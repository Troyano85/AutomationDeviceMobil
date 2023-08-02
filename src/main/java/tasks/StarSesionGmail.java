package tasks;

import interactions.WaitInteraction;
import io.cucumber.datatable.DataTable;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import userInterface.StarSesionGmailU;

import static net.serenitybdd.screenplay.Tasks.instrumented;


public class StarSesionGmail implements Task {

    StarSesionGmailU starSesionGmailU = new StarSesionGmailU();


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(WaitInteraction.waitClass(3000));
        // ExpectedConditions.presenceOfElementLocated((By) starSesionGmailU.tapEntendidoButton);
        starSesionGmailU.clickTapEntendidoButton();
        starSesionGmailU.clicktapMetoEmail();
    }

    public static StarSesionGmail enter(DataTable data) {
        return instrumented(StarSesionGmail.class, data);
    }
}
