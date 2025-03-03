package task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Click;
import userinterface.PaginaInfomacionCliente;

import static constantes.Constantes.*;

public class LlenarDatosCliente implements Task {

    public LlenarDatosCliente() {
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(NOMBRE_USARIO_CLIENTE).into(PaginaInfomacionCliente.CAMPO_NOMBRE),
                Enter.theValue(APELLIDO_USARIO_CLIENTE).into(PaginaInfomacionCliente.CAMPO_APELLIDO),
                Enter.theValue(CODIGO_POSTAL_CLIENTE).into(PaginaInfomacionCliente.CAMPO_CODIGO_POSTAL),
                Click.on(PaginaInfomacionCliente.BOTON_CONTINUAR)
        );
    }

    public static LlenarDatosCliente enFormulario() {
        return new LlenarDatosCliente();
    }
}