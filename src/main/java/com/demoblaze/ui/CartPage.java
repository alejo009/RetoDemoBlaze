package com.demoblaze.ui;

import net.serenitybdd.screenplay.targets.Target;

public class CartPage {
    public static final Target PRODUCT_NAME_ON_CART = Target.the("Name of product on cart").locatedBy("//tbody[@id='tbodyid']//td[text()='Samsung galaxy s6']");
}