package com.demoblaze.stepdefinitions;
import com.demoblaze.tasks.GoTo;
import com.demoblaze.tasks.SignUpUser;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.Random;

import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class SignUpStepDefinitions {
    @Before
    public void setTheStage(){
        OnStage.setTheStage(new OnlineCast());
    }
    public String generateRandomName(){
        String[] names = {"Juan","Pedro","Maria","Ana"};
        return names[new Random().nextInt(names.length)];
    }

    @Given("that {string} has opened the store")
    public void givenUserHasOpenedTheStore(String actorName){
        theActorCalled(actorName).wasAbleTo(GoTo.theUrl());
    }


    @When("he enters a name  and password")
    public void whenHeEnterNameAndPasswordInTheRegistrationForm(){
        String randomName = generateRandomName();
        String defaultPassword = "1232324";
        theActorInTheSpotlight().attemptsTo(SignUpUser.signUp(randomName,defaultPassword));
    }
}
