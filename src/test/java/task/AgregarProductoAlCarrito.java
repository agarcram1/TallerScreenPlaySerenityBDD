package task;

import net.serenitybdd.annotations.Step;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import userinterface.PaginaProductos;

public class AgregarProductoAlCarrito implements Task {

    private static final Logger LOGGER = LoggerFactory.getLogger(AgregarProductoAlCarrito.class);

    private String producto;

    public AgregarProductoAlCarrito(String producto) {
        this.producto = producto;
    }


    @Override
    public <T extends Actor> void performAs(T actor) {
        LOGGER.info("Se agrega el producto al carrito {}");
        actor.attemptsTo(
                Click.on(PaginaProductos.BOTON_AGREGAR_CARRITO_POR_NOMBRE(producto))
        );
        LOGGER.info("Se agrega el producto al carrito {}");
    }

    @Step("{0} agrega el producto {producto} al carrito")
    public static AgregarProductoAlCarrito conNombre(String producto) {
        return Tasks.instrumented(AgregarProductoAlCarrito.class, producto);
    }
}