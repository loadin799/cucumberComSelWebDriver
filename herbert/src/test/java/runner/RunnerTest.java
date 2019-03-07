package runner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"src/test/resources/features"}, format = {"pretty", "html:target/cucumber", "json:target/reports/CucumberReport.json"},
        glue = "steps", tags = {"~@ignore"})

// O TESTE VAI FALHAR POIS NÃO EXISTE MAIS A OPÇÃO DO MOTO G7 NO SITE DAS AMERICANAS.
public class RunnerTest {

}