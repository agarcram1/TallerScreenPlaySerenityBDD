package stepdefinitions;

    import hook.AbrirNavegador;
    import io.cucumber.java.es.Dado;
    import io.cucumber.java.es.Entonces;
    import net.serenitybdd.screenplay.actions.Click;
    import net.serenitybdd.screenplay.actors.OnStage;
    import net.serenitybdd.screenplay.ensure.Ensure;
    import org.slf4j.Logger;
    import org.slf4j.LoggerFactory;
    import task.IniciarSesion;
    import userinterface.PaginaLogin;

    import static constantes.Constantes.ACTOR;
    import static constantes.Constantes.WEB_URL;

    public class UsuarioBloqueadoStep {

        private static final Logger LOGGER = LoggerFactory.getLogger(UsuarioBloqueadoStep.class);

        @Dado("un usuario intenta iniciar sesión con usuario {string} y contraseña {string}")
        public void unUsuarioIntentaIniciarSesiónConUsuarioYContraseña(String usuario, String contraseña) {
            LOGGER.info("El usuario {} intenta iniciar sesión", usuario);
            OnStage.theActorCalled(ACTOR).attemptsTo(
                    AbrirNavegador.abrirurl(WEB_URL),
                    IniciarSesion.conCredenciales(usuario, contraseña),
                    Click.on(PaginaLogin.BOTON_LOGIN)
            );
        }

        @Entonces("el sistema muestra el mensaje de error {string}")
        public void elSistemaMuestraElMensajeDeError(String mensajeError) {
            LOGGER.info("El sistema muestra el mensaje de error {}", mensajeError);
            OnStage.theActorInTheSpotlight().attemptsTo(
                    Ensure.that(PaginaLogin.MENSAJE_ERROR).text().isEqualTo(mensajeError)
            );
        }
    }