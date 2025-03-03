package questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.targets.Target;
import userinterface.PaginaCarrito;

public class CompraFinalizadaExitosa implements Question<String> {


    private static final Target MENSAJE_COMPRA_FINALIZADA = PaginaCarrito.MENSAJE_COMPRA_EXITOSA;

    @Override
    public String answeredBy(Actor actor) {
        return MENSAJE_COMPRA_FINALIZADA.resolveFor(actor).getText();
    }
}
