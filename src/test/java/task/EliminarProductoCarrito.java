package task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import userinterface.PaginaCarrito;

public class EliminarProductoCarrito implements Task {

    String nombre;

    public EliminarProductoCarrito(String nombre) {
        this.nombre = nombre;
    }


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(PaginaCarrito.BOTON_ELIMINAR_DEL_CARRITO(nombre))
        );


    }

    public static EliminarProductoCarrito conNombre(String nombre) {
        return Tasks.instrumented(EliminarProductoCarrito.class, nombre);
    }
}
