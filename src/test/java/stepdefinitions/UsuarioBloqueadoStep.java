package stepdefinitions;

import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;

public class UsuarioBloqueadoStep {
    @Dado("un usuario esta bloqueado en la aplicacion swaglabs")
    public void usuarioBloqueadoEnSwaglabs() {
    }

    @Cuando("el usuario intenta iniciar sesion")
    public void usuarioIntentaIniciarSesion() {
    }

    @Entonces("el usuario visualiza el mensaje de error {string}")
    public void usuarioVeMensajeDeError(String FraseError) {
    }
}
