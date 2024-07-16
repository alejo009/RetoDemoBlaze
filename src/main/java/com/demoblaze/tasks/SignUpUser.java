package com.demoblaze.tasks;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static com.demoblaze.ui.SignUpPage.*;

public class SignUpUser implements Task {
    private final String userName;
    private final String password;

    public SignUpUser(String userName,String password){
        this.userName=userName;
        this.password=password;
    }

    @Override
    public <T extends Actor> void performAs(T actor){
        actor.attemptsTo(
                Click.on(SIGNUP_BUTTON),
                Enter.theValue(userName).into(FIELD_USER_NAME),
                Enter.theValue(password).into(FIELD_PASSWORD),
                Click.on(SIGNUP_BUTTON_ON_FORM)
        );

        try{
            Thread.sleep(2000);

        }catch(InterruptedException e){
            e.printStackTrace();
        }

        BrowseTheWeb.as(actor).getAlert().accept();

    }

    public static SignUpUser signUp(String userName,String password){
        return Tasks.instrumented(SignUpUser.class,userName,password);
    }
}