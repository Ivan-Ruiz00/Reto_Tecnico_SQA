package co.sqasa.task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static co.sqasa.ui.PaginaInicial.BOTON_NOTA_ENRIQUECIDA;

public class CrearNotaEnriquecida implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BOTON_NOTA_ENRIQUECIDA)
        );
    }
    public static CrearNotaEnriquecida crearNotaEnriquecida() {
        return new CrearNotaEnriquecida();
    }
}
