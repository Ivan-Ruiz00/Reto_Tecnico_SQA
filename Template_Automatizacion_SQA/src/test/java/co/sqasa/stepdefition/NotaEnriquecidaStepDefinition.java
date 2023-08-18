package co.sqasa.stepdefition;

import co.sqasa.task.AbrirPaginaInicial;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.log4j.Logger;
import org.junit.jupiter.api.Assertions;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class NotaEnriquecidaStepDefinition {
    public static Logger LOGGER = Logger.getLogger(NotaEnriquecidaStepDefinition.class);
    @Given("estoy en la pagina bloc de notas online")
    public void estoyEnLaPaginaBlocDeNotasOnline() {
        try {
            theActorInTheSpotlight().wasAbleTo(
                    new AbrirPaginaInicial()
            );
        }catch (Exception e){
            LOGGER.info("fallo la configuracion");
            LOGGER.warn(e.getMessage());
            Assertions.fail();
        }
    }
    @When("hago una nota con negrita")
    public void hagoUnaNotaConNegrita() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("la note debe contener lo escrito y se ve al lado derecho")
    public void laNoteDebeContenerLoEscritoYSeVeAlLadoDerecho() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
}
