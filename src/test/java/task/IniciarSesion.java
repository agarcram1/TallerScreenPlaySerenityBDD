package task;

import net.serenitybdd.annotations.Step;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Clear;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.Tasks;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class IniciarSesion implements Task {

    private static final Logger LOGGER = LoggerFactory.getLogger(IniciarSesion.class);

    private String usuario;
    private String contrasena;

    public IniciarSesion(String usuario, String contrasena) {
        this.usuario = usuario;
        this.contrasena = contrasena;
    }

    @Override
    @Step("{0} inicia sesion en la aplicacion con el usuario #usuario y la contrasena #contrasena")
    public <T extends Actor> void performAs(T actor) {
        LOGGER.info("Se inicia sesion en la aplicacion con el usuario {} y la contrasena {}", usuario, contrasena);
        actor.attemptsTo(
                Clear.field(userinterface.PaginaLogin.CAJA_USERNAME),
                Enter.keyValues(usuario).into(userinterface.PaginaLogin.CAJA_USERNAME),
                Clear.field(userinterface.PaginaLogin.CAJA_PASSWORD),
                Enter.keyValues(contrasena).into(userinterface.PaginaLogin.CAJA_PASSWORD),
                Click.on(userinterface.PaginaLogin.BOTON_LOGIN)

        );
        LOGGER.info("Se inicia sesion en la aplicacion con el usuario {} y la contrasena {}", usuario, contrasena);
    }


    public static IniciarSesion conCredenciales(String usuario, String contrasena) {
        return Tasks.instrumented(IniciarSesion.class, usuario, contrasena);
    }
}
