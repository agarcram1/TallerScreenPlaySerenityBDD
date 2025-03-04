package task;

import net.serenitybdd.annotations.Step;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import userinterface.PaginaCarrito;

public class EliminarProductoCarrito implements Task {

    private static final Logger LOGGER = LoggerFactory.getLogger(EliminarProductoCarrito.class);

    String nombre;

    public EliminarProductoCarrito(String nombre) {
        this.nombre = nombre;
    }


    @Override
    public <T extends Actor> void performAs(T actor) {
        LOGGER.info("Se elimina el producto del carrito {}");
        actor.attemptsTo(
                Click.on(PaginaCarrito.BOTON_ELIMINAR_DEL_CARRITO(nombre))
        );
        LOGGER.info("Se elimina el producto del carrito {}");


    }

    @Step("{0} elimina el producto {nombre} del carrito")
    public static EliminarProductoCarrito conNombre(String nombre) {
        return Tasks.instrumented(EliminarProductoCarrito.class, nombre);
    }
}
