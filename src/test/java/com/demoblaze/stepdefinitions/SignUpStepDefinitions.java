package com.demoblaze.stepdefinitions;

import com.demoblaze.questions.AlertText;
import com.demoblaze.tasks.SignUpUser;
import com.demoblaze.utils.RandomStringGenerator;
import io.cucumber.java.Before;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.Matchers.equalTo;

public class SignUpStepDefinitions {
    @Before
    public void setTheStage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @When("he enters a name  and password")
    public void whenHeEnterNameAndPasswordInTheRegistrationForm() {
        String randomName = RandomStringGenerator.generateRandomString(5);
        String randomPassword = RandomStringGenerator.generateRandomString(5);
        theActorInTheSpotlight().attemptsTo(SignUpUser.signUp(randomName, randomPassword));
    }

    @Then("he should see an alert with the text Signup successful.")
    public void heShouldSeeAnAlertWithTheTextSignupSuccessful() {
        theActorInTheSpotlight().should(seeThat(AlertText.value(), equalTo("Sign up successful.")));
    }
}