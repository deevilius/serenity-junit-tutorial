package serenityswag.inventory;

import net.serenitybdd.core.pages.PageObject;

public class ProductDetailsPageObject extends PageObject {
    public String productName() {
            return find(".inventory_details_name").getText();
    }
}
