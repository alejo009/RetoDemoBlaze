package com.demoblaze.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Click;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

import static com.demoblaze.ui.ProductDetailsPage.ADD_BUTTON;
import static com.demoblaze.ui.ProductDetailsPage.CART;

public class Add implements Task {
    @Managed
    WebDriver driver;

    @Override
    public <T extends Actor> void performAs(T actor){
        actor.attemptsTo(
                Click.on(ADD_BUTTON)

        );

        try{
            Thread.sleep(2000);

        }catch(InterruptedException e){
            e.printStackTrace();
        }

        BrowseTheWeb.as(actor).getAlert().accept();
        actor.attemptsTo(Click.on(CART));
    }

    public static Add theProductWithThe(){
        return Tasks.instrumented(Add.class);
    }
}
