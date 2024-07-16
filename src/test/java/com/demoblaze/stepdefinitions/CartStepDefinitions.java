package com.demoblaze.stepdefinitions;

import com.demoblaze.tasks.GoTo;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import static net.serenitybdd.screenplay.actors.OnStage.*;

public class CartStepDefinitions {

    @Before
    public void setTheStage(){
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("that {string} has opened the store")
    public void givenThatHasOpenedTheStore(String actorName){
        theActorCalled(actorName).wasAbleTo(GoTo.theUrl());
    }

}
