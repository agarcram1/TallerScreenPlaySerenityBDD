package task;

import net.serenitybdd.annotations.Step;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Click;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import userinterface.PaginaInfomacionCliente;

import static constantes.Constantes.*;

public class LlenarDatosCliente implements Task {

    private static final Logger LOGGER = LoggerFactory.getLogger(LlenarDatosCliente.class);


    public LlenarDatosCliente() {
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        LOGGER.info("Se llena el formulario con los datos del cliente {NOMBRE_USARIO_CLIENTE}, {APELLIDO_USARIO_CLIENTE}, {CODIGO_POSTAL_CLIENTE}");
        actor.attemptsTo(
                Enter.theValue(NOMBRE_USARIO_CLIENTE).into(PaginaInfomacionCliente.CAMPO_NOMBRE),
                Enter.theValue(APELLIDO_USARIO_CLIENTE).into(PaginaInfomacionCliente.CAMPO_APELLIDO),
                Enter.theValue(CODIGO_POSTAL_CLIENTE).into(PaginaInfomacionCliente.CAMPO_CODIGO_POSTAL),
                Click.on(PaginaInfomacionCliente.BOTON_CONTINUAR)
        );
        LOGGER.info("Se llena el formulario con los datos del cliente");
    }

    @Step("{0} llena el formulario con los datos del cliente")
    public static LlenarDatosCliente enFormulario() {
        return new LlenarDatosCliente();
    }
}