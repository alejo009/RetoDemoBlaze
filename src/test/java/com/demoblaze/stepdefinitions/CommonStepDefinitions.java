package com.demoblaze.stepdefinitions;

import com.demoblaze.tasks.GoTo;
import io.cucumber.java.en.Given;
import net.serenitybdd.screenplay.actors.OnStage;

public class CommonStepDefinitions {
    @Given("that {string} has opened the store")
    public void givenThatHasOpenedTheStore(String actorName) {
        OnStage.theActorCalled(actorName).wasAbleTo(GoTo.theUrl());
    }
}