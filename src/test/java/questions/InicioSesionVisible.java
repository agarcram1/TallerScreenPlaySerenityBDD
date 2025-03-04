package questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.targets.Target;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import userinterface.PaginaProductos; // Importa PaginaProductos

public class InicioSesionVisible implements Question<Boolean> {

    private static final Logger LOGGER = LoggerFactory.getLogger(InicioSesionVisible.class);

    private static final Target PRODUCT_LABEL = PaginaProductos.LABEL_PRODUCTOS;

    @Override
    public Boolean answeredBy(Actor actor) {
        LOGGER.info("Se valida que la pagina de productos este visible");
        return PRODUCT_LABEL.resolveFor(actor).isVisible();
    }


}
