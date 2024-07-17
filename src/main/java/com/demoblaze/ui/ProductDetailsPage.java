package com.demoblaze.ui;

import net.serenitybdd.screenplay.targets.Target;

public class ProductDetailsPage {
    public static final Target ADD_BUTTON = Target.the("ProductWas Button").locatedBy("//a[@class='btn btn-success btn-lg' and 'ProductWas to cart']");
    public static final Target CART = Target.the("Cart").locatedBy("//*[@id='cartur']");
}