package co.sqasa.stepdefition;

import co.sqasa.setup.Configuracion;
import co.sqasa.task.AbrirPaginaInicial;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.log4j.Logger;
import org.junit.jupiter.api.Assertions;

import static co.sqasa.task.CrearNotaEnriquecida.crearNotaEnriquecida;
import static co.sqasa.task.EscribirNota.escribirNota;
import static co.sqasa.task.GuardarNota.guardarNota;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class NotaEnriquecidaStepDefinition extends Configuracion {
    public static Logger LOGGER = Logger.getLogger(NotaEnriquecidaStepDefinition.class);
    @Given("estoy en la pagina bloc de notas online")
    public void estoyEnLaPaginaBlocDeNotasOnline() {
        try {
            configurarNavegador();
            theActorInTheSpotlight().wasAbleTo(
                    new AbrirPaginaInicial()
            );
        }catch (Exception e){
            LOGGER.info("fallo la configuracion");
            LOGGER.warn(e.getMessage());
            Assertions.fail();
            quitarDriver();
        }
    }
    @When("hago una nota con negrita")
    public void hagoUnaNotaConNegrita() {
        try{
            theActorInTheSpotlight().attemptsTo(
                    crearNotaEnriquecida(),
                    escribirNota().conLaNota("Hola, soy Ivan"),
                    guardarNota()
            );
        }catch (Exception e){
            LOGGER.info("fallo el proceso de creación de una nota");
            LOGGER.warn(e.getMessage());
            Assertions.fail();
            quitarDriver();
        }
    }
    @Then("la note debe contener lo escrito y se ve al lado derecho")
    public void laNoteDebeContenerLoEscritoYSeVeAlLadoDerecho() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
}
