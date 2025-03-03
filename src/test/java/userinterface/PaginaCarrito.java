package userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class PaginaCarrito extends PageObject {

    public static final Target PRODUCTO_EN_CARRITO = Target.the("Producto en el carrito")
            .locatedBy("//div[@class='cart_quantity']");
}

