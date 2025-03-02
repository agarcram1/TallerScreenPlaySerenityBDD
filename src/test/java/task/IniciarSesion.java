package task;

import net.serenitybdd.annotations.Step;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Clear;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.Tasks;

public class IniciarSesion implements Task {

    private String usuario;
    private String contrasena;

    public IniciarSesion(String usuario, String contrasena) {
        this.usuario = usuario;
        this.contrasena = contrasena;
    }

    @Override
    @Step("{0} inicia sesion en la aplicacion con el usuario #standard_user y la contrasena #secret_sauce")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Clear.field(userinterface.PaginaLogin.CAJA_USERNAME),
                Enter.keyValues(usuario).into(userinterface.PaginaLogin.CAJA_USERNAME),
                Clear.field(userinterface.PaginaLogin.CAJA_PASSWORD),
                Enter.keyValues(contrasena).into(userinterface.PaginaLogin.CAJA_PASSWORD),
                Click.on(userinterface.PaginaLogin.BOTON_LOGIN)

        );
    }

    public static IniciarSesion conCredenciales(String usuario, String contrasena) {
        return Tasks.instrumented(IniciarSesion.class, usuario, contrasena);
    }
}
