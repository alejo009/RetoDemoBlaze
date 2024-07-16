package com.demoblaze.ui;

import net.serenitybdd.screenplay.targets.Target;

public class ProductListPage {
    public static final Target PRODUCT = Target.the("Label Product").locatedBy("//div[@id='tbodyid']//a[text()='{0}']");
}
