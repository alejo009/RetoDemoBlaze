package com.demoblaze.ui;

import net.serenitybdd.screenplay.targets.Target;

public class SignUpPage {
    public static final Target SIGNUP_BUTTON =  Target.the("Sign up a new user button").locatedBy("#signin2");
    public static final Target FIELD_USER_NAME = Target.the("UserName field").locatedBy("#sign-username");
    public static final Target FIELD_PASSWORD = Target.the("Password field").locatedBy("#sign-password");
    public static final Target SIGNUP_BUTTON_ON_FORM = Target.the("Sign up button in the form of register").locatedBy("//button[contains(text(),'Sign up')]");
}
