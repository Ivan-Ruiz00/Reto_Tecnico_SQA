package co.sqasa.runners;
import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;
@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        snippets = CucumberOptions.SnippetType.CAMELCASE,
        features = {"src/test/resources/features/escribirnotaenriquecida.feature"},
        glue = {"co.sqasa.stepdefition"},
        tags = {}
)
public class escribirNotaEnriquecidaTest {
}
