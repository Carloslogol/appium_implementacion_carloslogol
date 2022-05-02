package co.carloslogol.test_app.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features/login.feature",
        glue = "co.carloslogol.test_app.stepdefinitions",
        snippets = SnippetType.CAMELCASE)

public class RunnerTags {}