package co.sqasa.task;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static co.sqasa.ui.PaginaInicial.BOTON_NEGRITA;
import static co.sqasa.ui.PaginaInicial.ESPACIO_DE_ESCRITURA;

public class EscribirNota implements Task {
    private String nota;
    public EscribirNota conLaNota(String nota){
        this.nota=nota;
        return this;
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BOTON_NEGRITA),
                Enter.theValue(nota).into(ESPACIO_DE_ESCRITURA)
        );
    }
    public static EscribirNota escribirNota(){
        return new EscribirNota();
    }
}
