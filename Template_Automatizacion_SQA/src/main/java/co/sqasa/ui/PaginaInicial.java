package co.sqasa.ui;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class PaginaInicial extends PageObject {
    public static final Target BOTON_NOTA_ENRIQUECIDA= Target.the("boton de nota de texto enriquecido")
            .located(By.xpath("(//button[@id='richtextnote-tab'])[1]"));
    public static final Target BOTON_NEGRITA= Target.the("boton negrita")
            .located(By.xpath("(//button[@class='ck ck-button ck-off'])[1]"));
    public static final Target ESPACIO_DE_ESCRITURA= Target.the("Cuadro de texto")
            .located(By.xpath("(//div[@id='editor'])"));
    public static final Target GUARDAR= Target.the("Boton de guardar")
            .located(By.xpath("(//button[@class='btn save-file-btn saveNotesBtn richtextnoteBtn'])"));
}
