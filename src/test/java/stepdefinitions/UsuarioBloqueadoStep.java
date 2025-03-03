package stepdefinitions;

import hook.AbrirNavegador;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.ensure.Ensure;
import task.IniciarSesion;
import userinterface.PaginaLogin;

import static constantes.Constantes.ACTOR;
import static constantes.Constantes.WEB_URL;

public class UsuarioBloqueadoStep {
    @Dado("un usuario intenta iniciar sesión con usuario {string} y contraseña {string}")
    public void unUsuarioIntentaIniciarSesiónConUsuarioYContraseña(String usuario, String contraseña) {
        OnStage.theActorCalled(ACTOR).attemptsTo(
                AbrirNavegador.abrirurl(WEB_URL),
                IniciarSesion.conCredenciales(usuario, contraseña)
        );
    }

    @Entonces("el sistema muestra el mensaje de error {string}")
    public void elSistemaMuestraElMensajeDeError(String mensajeError) {
        OnStage.theActorInTheSpotlight().attemptsTo(
                Ensure.that(PaginaLogin.MENSAJE_ERROR).text().isEqualTo(mensajeError)
        );

    }
}
