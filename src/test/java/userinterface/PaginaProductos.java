package userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class PaginaProductos extends PageObject {

    public static final Target LABEL_PRODUCTOS = Target.the("Label Productos")
            .locatedBy("//div[@class='product_label']");
}