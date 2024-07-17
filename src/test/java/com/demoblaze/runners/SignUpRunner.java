package com.demoblaze.runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        glue = {"com.demoblaze.stepdefinitions"},
        features = "src/test/resources/features/signup.feature",
        tags = "",
        snippets = CucumberOptions.SnippetType.CAMELCASE
)
public class SignUpRunner {

}