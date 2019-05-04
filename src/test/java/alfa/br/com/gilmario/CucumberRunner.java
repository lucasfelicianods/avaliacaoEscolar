package alfa.br.com.gilmario;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(format = {"pretty", "html:reports/teste-report"},
							glue= {"alfa.br.com.gilmario"},
							features= {"src/test/resources/avaliacao.feature"}	)
public class CucumberRunner {

}
