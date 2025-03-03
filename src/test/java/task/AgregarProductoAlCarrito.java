package task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import userinterface.PaginaProductos;

public class AgregarProductoAlCarrito implements Task {

    private String producto;

    public AgregarProductoAlCarrito(String producto) {
        this.producto = producto;
    }

    public static AgregarProductoAlCarrito conNombre(String producto) {
        return Tasks.instrumented(AgregarProductoAlCarrito.class, producto);
    }



    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(PaginaProductos.NOMBRE_PRODUCTO),
                Click.on(PaginaProductos.BOTON_AGREGAR_CARRITO));
    }
}
