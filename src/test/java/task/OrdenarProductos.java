package task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import userinterface.PaginaCarrito;
import userinterface.PaginaProductos;

public class OrdenarProductos implements Task {

    private String criterio;

    public OrdenarProductos(String criterio) {
        this.criterio = criterio;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(PaginaProductos.ORDENAR_PRODUCTOS),
                Click.on(PaginaProductos.opcionDeOrden(criterio))
        );
    }

    public static OrdenarProductos porCriterio(String criterio) {
        return Tasks.instrumented(OrdenarProductos.class, criterio);
    }

}
