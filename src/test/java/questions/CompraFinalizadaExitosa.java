package questions;

import net.serenitybdd.annotations.Step;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.targets.Target;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import userinterface.PaginaCarrito;

public class CompraFinalizadaExitosa implements Question<String> {

    public static final Logger LOGGER = LoggerFactory.getLogger(CompraFinalizadaExitosa.class);


    private static final Target MENSAJE_COMPRA_FINALIZADA = PaginaCarrito.MENSAJE_COMPRA_EXITOSA;

    @Override
    @Step("{0} valida que la compra se haya realizado exitosamente")
    public String answeredBy(Actor actor) {
        LOGGER.info("Se valida que la compra se haya realizado exitosamente");
        return MENSAJE_COMPRA_FINALIZADA.resolveFor(actor).getText();
    }
}
