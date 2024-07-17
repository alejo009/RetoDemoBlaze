package com.demoblaze.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.ensure.Ensure;

import static com.demoblaze.ui.CartPage.PRODUCT_NAME_ON_CART;

public class ProductWas implements Question<Boolean> {
    @Override
    public Boolean answeredBy(Actor actor) {
        Ensure.that(PRODUCT_NAME_ON_CART).hasText(actor.recall("product"));

        return true;
    }

    public static ProductWas Added() {
        return new ProductWas();
    }
}
