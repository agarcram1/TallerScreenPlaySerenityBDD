package task;

import net.serenitybdd.annotations.Step;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import userinterface.PaginaProductos;

public class OrdenarProductos implements Task {

    private static final Logger LOGGER = LoggerFactory.getLogger(OrdenarProductos.class);

    private String criterio;

    public OrdenarProductos(String criterio) {
        this.criterio = criterio;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        LOGGER.info("Se ordenan los productos por el criterio {}", criterio);
        actor.attemptsTo(
                Click.on(PaginaProductos.ORDENAR_PRODUCTOS),
                Click.on(PaginaProductos.opcionDeOrden(criterio))
        );
        LOGGER.info("Se ordenan los productos por el criterio {}", criterio);
    }

    @Step("{0} ordena los productos por el criterio #criterio")
    public static OrdenarProductos porCriterio(String criterio) {
        return Tasks.instrumented(OrdenarProductos.class, criterio);
    }

}
