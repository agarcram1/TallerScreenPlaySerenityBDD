package stepdefinitions;

import hook.AbrirNavegador;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import io.cucumber.java.es.Y;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.ensure.Ensure;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import questions.CompraFinalizadaExitosa;
import questions.InicioSesionVisible;
import task.*;
import userinterface.PaginaCarrito;
import userinterface.PaginaInfomacionCliente;
import userinterface.PaginaProductos;

import static constantes.Constantes.*;
import static net.serenitybdd.core.Serenity.getDriver;

public class LoginYOrdenarProductosStep {

    private static final Logger LOGGER = LoggerFactory.getLogger(LoginYOrdenarProductosStep.class);

    @Dado("un usuario inicia sesión con usuario {string} y contraseña {string}")
    public void usuarioHaIniciadosesion(String usuario, String contraseña) {
        LOGGER.info("El usuario {} intenta iniciar sesión", usuario);
        OnStage.theActorCalled(ACTOR).attemptsTo(
                AbrirNavegador.abrirurl(WEB_URL),
                IniciarSesion.conCredenciales(usuario, contraseña)
        );

        Boolean isProductLabelVisible = OnStage.theActorInTheSpotlight().asksFor(new InicioSesionVisible());
        Ensure.that(isProductLabelVisible).isTrue();
    }

    @Cuando("ordena los productos por {string}")
    public void ordenaLosProductosPor(String criterio) {
        LOGGER.info("Ordena los productos por {}", criterio);
        OnStage.theActorInTheSpotlight().attemptsTo(
                OrdenarProductos.porCriterio(criterio)
        );
    }

    @Y("agrega los productos {string} y {string} al carrito")
    public void agregaLosProductosYAlCarrito(String nombreProducto1, String nombreProducto2) {
        LOGGER.info("Agrega los productos {} y {} al carrito", nombreProducto1, nombreProducto2);
        OnStage.theActorInTheSpotlight().attemptsTo(
                AgregarProductoAlCarrito.conNombre(nombreProducto1),
                AgregarProductoAlCarrito.conNombre(nombreProducto2),
                Click.on(PaginaProductos.BOTON_CARRITO)
        );
    }

    @Y("elimina el producto {string} del carrito")
    public void eliminaElProductoDelCarrito(String nombre) {
        LOGGER.info("Elimina el producto {} del carrito", nombre);
        WebDriver driver = getDriver();
        PaginaCarrito paginaCarrito = new PaginaCarrito();
        paginaCarrito.waitForElementToBePresent(driver, By.xpath("//div[contains(text(), '" + nombre + "')]/ancestor::div[@class='cart_item']//button[text()='REMOVE']"), 20);
        paginaCarrito.waitForElementToBePresent(driver, By.xpath("//a[text()='CHECKOUT']"), 20);
        OnStage.theActorInTheSpotlight().attemptsTo(
                EliminarProductoCarrito.conNombre(nombre)
        );
    }

    @Y("finaliza la compra")
    public void finalizaLaCompra() {
        LOGGER.info("Finaliza la compra");
        OnStage.theActorInTheSpotlight().attemptsTo(
                Click.on(PaginaCarrito.BOTON_CHECKOUT),
                LlenarDatosCliente.enFormulario(),
                Click.on(PaginaInfomacionCliente.BOTON_FINALIZAR)
            );
        }

    @Entonces("la compra se completa exitosamentes")
    public void la_compra_se_completa_exitosamentes() {
        LOGGER.info("La compra se completa exitosamente");
        String mensajeCompra = OnStage.theActorInTheSpotlight().asksFor(new CompraFinalizadaExitosa());
        LOGGER.info("Mensaje de compra: {}", mensajeCompra);
        Ensure.that(mensajeCompra).isEqualTo("THANK YOU FOR YOUR ORDER");
    }
}