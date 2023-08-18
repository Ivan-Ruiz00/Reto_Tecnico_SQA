package co.sqasa.task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static co.sqasa.ui.PaginaInicial.GUARDAR;

public class GuardarNota implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(GUARDAR)
        );
    }
    public static GuardarNota guardarNota(){
        return new GuardarNota();
    }
}
