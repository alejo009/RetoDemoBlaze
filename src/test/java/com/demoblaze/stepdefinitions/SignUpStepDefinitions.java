package com.demoblaze.stepdefinitions;

import com.demoblaze.tasks.SignUpUser;
import com.demoblaze.utils.RandomStringGenerator;
import io.cucumber.java.Before;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

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
}