package runner;

 

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

 

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"json:target/json/cucumber.json", "junit:target/junit/cucumber.xml"},
        glue = {"steps"},
        features = "./src/main/java/features/",
//       tags = "@BuscaCredenciado",
        snippets = SnippetType.CAMELCASE
        )

 


public class TestRunner {

 


}