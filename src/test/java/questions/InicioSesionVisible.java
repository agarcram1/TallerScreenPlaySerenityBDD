package questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.targets.Target;
import userinterface.PaginaProductos; // Importa PaginaProductos

public class InicioSesionVisible implements Question<Boolean> {

    private static final Target PRODUCT_LABEL = PaginaProductos.LABEL_PRODUCTOS;

    @Override
    public Boolean answeredBy(Actor actor) {
        return PRODUCT_LABEL.resolveFor(actor).isVisible();
    }

    public static InicioSesionVisible enLaPaginaDeProductos() {
        return new InicioSesionVisible();
    }
}
