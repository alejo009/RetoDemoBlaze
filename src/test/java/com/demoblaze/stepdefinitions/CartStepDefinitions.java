package com.demoblaze.stepdefinitions;

import com.demoblaze.questions.ProductWas;
import com.demoblaze.tasks.Add;
import com.demoblaze.tasks.Select;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.*;

public class CartStepDefinitions {
    @Before
    public void setTheStage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @When("he select the product from section")
    public void whenSelectTheProductFromSection(DataTable data) {
        theActorInTheSpotlight().attemptsTo(Select.theProductWithThe(data));
    }

    @And("he adds the product to the cart with")
    public void andHeAddsTheProductToTheCartWith() {
        theActorInTheSpotlight().attemptsTo(Add.theProductWithThe());
    }

    @Then("he should see the added product in the cart")
    public void thenHeShouldSeeTheAddedProductInTheCart() {
        theActorInTheSpotlight().should(seeThat(ProductWas.Added()));
    }
}
